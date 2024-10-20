package com.example.bochackathon_android.network.config.interceptors

import android.util.Log
import com.example.bochackathon_android.network.main.NETWORK_TAG
import okhttp3.Interceptor
import okhttp3.Response

object RequestInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        Log.i(NETWORK_TAG,"Outgoing request to ${request.url}")
        return chain.proceed(request)
    }
}