package com.example.bochackathon_android.network.main

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit


const val BASE_URL = "http://10.1.1.43:8888/api/v1/kyb/"
const val NETWORK_TAG = "#Network"
const val TIMEOUT_DURATION = 2L

object RetrofitInstance {

    private var apiService: ApiService? = null

    fun getApiServiceInstance(): ApiService? {
        if (apiService == null) {
            apiService = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(this.okHttpClient ?: createNewRegistrationClient())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiService::class.java)
        }
        return apiService
    }


    private var okHttpClient: OkHttpClient? = null
        get() {
            if (field == null) {
                field = createNewRegistrationClient()
            }
            return field
        }

    private fun createNewRegistrationClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .readTimeout(TIMEOUT_DURATION, TimeUnit.MINUTES)
            .connectTimeout(TIMEOUT_DURATION, TimeUnit.MINUTES)
            .writeTimeout(TIMEOUT_DURATION, TimeUnit.MINUTES)
            .callTimeout(TIMEOUT_DURATION, TimeUnit.MINUTES)
            .connectTimeout(TIMEOUT_DURATION, TimeUnit.MINUTES)
            .addInterceptor(loggingInterceptor)
            .build()

    }
}

val loggingInterceptor = HttpLoggingInterceptor().apply {
    level = HttpLoggingInterceptor.Level.BODY
}
