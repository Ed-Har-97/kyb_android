package com.example.bochackathon_android.network.models.request_models

import com.example.bochackathon_android.utils.EMPTY_STRING
import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json
import java.io.Serializable

//data class FoundCompanyRequest(
//    @SerializedName("companyName")
//    var companyName: String = EMPTY_STRING,
//
//    @SerializedName("country")
//    var country: String = EMPTY_STRING
//) : Serializable

data class FoundCompanyRequest(
    @SerializedName("companyName")
    var companyName: String = EMPTY_STRING,

    @SerializedName("country")
    var country: String = EMPTY_STRING
) : Serializable
