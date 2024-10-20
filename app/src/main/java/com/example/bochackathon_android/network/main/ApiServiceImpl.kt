package com.example.bochackathon_android.network.main

import com.example.bochackathon_android.network.config.network_response.NetworkResponse
import com.example.bochackathon_android.network.models.request_models.FoundCompanyRequest
import com.example.bochackathon_android.network.models.response_models.found_company.FoundCompanyResponseItem
import java.net.ConnectException

//class ApiServiceImpl {
//}

//class ApiServiceImpl():ApiService{
//    override suspend fun getCompanyInfo(requestBody: FoundCompanyRequest): NetworkResponse<List<FoundCompanyResponseItem>> {
//            val response = RetrofitInstance.getApiServiceInstance()?.getCompanyInfo()
//        if (response)
//    }
//
//}




//class ApiServiceImpl : ApiService {
//    override suspend fun getCompanyInfo(requestBody: FoundCompanyRequest): NetworkResponse<List<FoundCompanyResponseItem>> {
//        return try {
////            val response = retrofit.create(MyApi::class.java).getUser(id)
//            val response = RetrofitInstance.getApiServiceInstance()?.getCompanyInfo(requestBody)
//            if (response.isSuccessful) {
//                NetworkResponse.Success(response.body()!!)
//            } else {
//                NetworkResponse.Error(response.message(), response.code())
//            }
//        } catch (e: ConnectException) {
//            NetworkResponse.NetworkError // Handle ConnectException
//        } catch (e: Exception) {
//            NetworkResponse.Error(e.message, exception = e)
//        }
//    }
//}