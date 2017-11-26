package com.kgmyshin.swagger.sample.api.json


import com.google.gson.annotations.SerializedName

/**
 * 
 * @param code 
 * @param type 
 * @param message 
 */
data class ApiResponseJson (
    @SerializedName("code") val code: Int,
    @SerializedName("type") val type: String,
    @SerializedName("message") val message: String
)
