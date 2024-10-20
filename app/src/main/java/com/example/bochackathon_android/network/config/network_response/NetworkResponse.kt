package com.example.bochackathon_android.network.config.network_response

import com.google.gson.annotations.SerializedName
import kotlinx.coroutines.CancellableContinuation
import okhttp3.Headers
import java.io.Serializable
import kotlin.coroutines.resume


sealed class NetworkResponse<out T> {
    data object Loading : NetworkResponse<Nothing>()
    data class Success<out T>(val data: T) : NetworkResponse<T>()
    data class Error(
        val message: String?,
        val statusCode: Int? = null,
        val exception: Throwable? = null
    ) : NetworkResponse<Nothing>()

    data object NetworkError : NetworkResponse<Nothing>() // Add this for ConnectException
}

interface NetworkCall<T> {
    fun cancel()
    fun enqueue(onResult: (NetworkResult<T>) -> Unit)
    fun enqueueWithHeaders(onResult: (NetworkResult<T>, Headers?) -> Unit)
    fun enqueueWithoutTokensAutoRefresh(onResult: (NetworkResult<T>) -> Unit)
}

sealed class NetworkResult<out T> {

    data class Success<out T>(val data: T) : NetworkResult<T>()

    data class Failure<out T>(val data: NetworkResponse.NetworkError) : NetworkResult<T>()

    fun handleInCoroutine(continuation: CancellableContinuation<ModelResult<T, String>>) {
        when (this) {
            is Success<T> -> continuation.resumeIfActive(ModelResult.Ok(this.data))
            is Failure<T> -> continuation.resumeIfActive(ModelResult.Err(this.data.toString()))
            else -> continuation.resumeIfActive(ModelResult.Err("Undefined error"))
        }
    }

    fun handleInCoroutineWithError(continuation: CancellableContinuation<ModelResult<T, NetworkResponse.NetworkError>>) {
        when (this) {
            is Success<T> -> continuation.resumeIfActive(ModelResult.Ok(this.data))
            is Failure<T> -> continuation.resumeIfActive(ModelResult.Err(this.data))
        }
    }
}

sealed class NetworkError(private val errorDto: ErrorDto?) : NetworkResult<Any>() {

    open fun getMessage(): String {
        val errorDto = errorDto
        return if (errorDto == null) {
            getMessageWhenRemoteRespondedNothing()
        } else {
            "${errorDto.errorDescription}"
        }
    }

    fun getError(): String? {
        return errorDto?.error
    }

    protected open fun getMessageWhenRemoteRespondedNothing(): String =
        "unknown exception"
}

sealed class ModelResult<out R, out E> {
    data class Ok<out R>(val value: R) : ModelResult<R, Nothing>()
    data class Err<out E>(val value: E) : ModelResult<Nothing, E>()
}

fun <T> CancellableContinuation<T>.resumeIfActive(value: T) {
    if (this.isActive) {
        this.resume(value)
    }
}

class ErrorDto : Serializable {
    @SerializedName("error")
    var error: String? = ""

    @SerializedName("error_description")
    var errorDescription: String? = ""

    @SerializedName("args")
    var args: Any? = null
}