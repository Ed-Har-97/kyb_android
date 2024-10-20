package com.example.bochackathon_android.network.config.interceptors

import okhttp3.Interceptor
import okhttp3.Response


object AuthorizationInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val requestWithHeader = chain.request()
            .newBuilder()
            .header(
                "Authorization", "Bearer"
            ).build()
        return chain.proceed(requestWithHeader)
    }
}