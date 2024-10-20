package com.example.bochackathon_android.network.main

import com.example.bochackathon_android.network.config.network_response.NetworkResponse
import com.example.bochackathon_android.network.models.request_models.FoundCompanyRequest
import com.example.bochackathon_android.network.models.response_models.found_company.FoundCompanyResponseItem
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {

    @POST(STEP_1)
    suspend fun getCompanyInfo(@Body requestBody: FoundCompanyRequest): NetworkResponse<List<FoundCompanyResponseItem>>
}

private const val STEP_1 = "step/1"
private const val GET_COUNTRY_LIST = "country/list"

