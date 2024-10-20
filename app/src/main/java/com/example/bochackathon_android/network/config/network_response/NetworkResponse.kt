package com.example.bochackathon_android.network.config.network_response



//sealed class NetworkResponse<out T> {
//    object Loading : NetworkResponse<Nothing>()
//    data class Success<out T>(val data: T) : NetworkResponse<T>()
//    data class Error(val message: String?, val statusCode: Int? = null) : NetworkResponse<Nothing>()
//}

sealed class NetworkResponse<out T> {
    data object Loading : NetworkResponse<Nothing>()
    data class Success<out T>(val data: T) : NetworkResponse<T>()
    data class Error(val message: String?, val statusCode: Int? =null, val exception: Throwable? = null) : NetworkResponse<Nothing>()
    data object NetworkError : NetworkResponse<Nothing>() // Add this for ConnectException
}