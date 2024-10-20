package com.example.bochackathon_android.network.models.response_models.found_company

import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json
import java.io.Serializable

data class FoundCompanyRequestCountry(
//    @SerializedName("id")
    @SerializedName("id")
    val id: Int,

//    @SerializedName("autoReject")
    @SerializedName("autoReject")
    val autoReject: Boolean,

//    @SerializedName("name")
    @SerializedName("name")
    val name: String,

//    @SerializedName("showOnUi")
    @SerializedName("showOnUi")
    val showOnUi: Boolean
) : Serializable