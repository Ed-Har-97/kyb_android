package com.example.bochackathon_android.ui.onboarding_find_company

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bochackathon_android.network.main.RetrofitInstance
import com.example.bochackathon_android.network.models.request_models.FoundCompanyRequest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit

class OnboardingFindCompanyViewModel : ViewModel() {

    fun requestToFindCompanyInfo(companyName: String, country: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val response = RetrofitInstance.getApiServiceInstance()?.getCompanyInfo(
                requestBody = FoundCompanyRequest(
                    companyName = companyName,
                    country = country
                )
            )
        }
    }

    fun getCountryList() {
        viewModelScope.launch(Dispatchers.IO) {
            val response = RetrofitInstance.getApiServiceInstance()?.getCountryList()
        }
    }
}

