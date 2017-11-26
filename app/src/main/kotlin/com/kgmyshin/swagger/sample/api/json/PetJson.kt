package com.kgmyshin.swagger.sample.api.json

import com.kgmyshin.swagger.sample.api.json.CategoryJson
import com.kgmyshin.swagger.sample.api.json.TagJson

import com.google.gson.annotations.SerializedName

/**
 * 
 * @param id 
 * @param category 
 * @param name 
 * @param photo_urls 
 * @param tags 
 * @param status pet status in the store
 */
data class PetJson (
    @SerializedName("id") val id: Long,
    @SerializedName("category") val category: CategoryJson,
    @SerializedName("name") val name: String?,
    @SerializedName("photo_urls") val photoUrls: List<String>?,
    @SerializedName("tags") val tags: List<TagJson>,
    @SerializedName("status") val status: String
)
