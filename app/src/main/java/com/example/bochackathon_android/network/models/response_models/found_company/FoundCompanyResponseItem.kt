package com.example.bochackathon_android.network.models.response_models.found_company

import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json
import java.io.Serializable

data class FoundCompanyResponseItem(
    @SerializedName("id")
    val id: Int,

    @SerializedName("city")
    val city: String,

    @SerializedName("country")
    val country: FoundCompanyRequestCountry,

    @SerializedName("entityType")
    val entityType: String,

    @SerializedName("name")
    val name: String,

    @SerializedName("registrationDate")
    val registrationDate: String,

    @SerializedName("registrationLocation")
    val registrationLocation: String,

    @SerializedName("registrationNumber")
    val registrationNumber: String,

    @SerializedName("state")
    val state: String,

    @SerializedName("zip")
    val zip: String
) : Serializable