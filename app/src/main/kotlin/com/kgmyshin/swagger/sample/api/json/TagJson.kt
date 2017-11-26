package com.kgmyshin.swagger.sample.api.json


import com.google.gson.annotations.SerializedName

/**
 * 
 * @param id 
 * @param name 
 */
data class TagJson (
    @SerializedName("id") val id: Long,
    @SerializedName("name") val name: String
)
