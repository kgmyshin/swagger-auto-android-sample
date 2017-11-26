package com.kgmyshin.swagger.sample.api.json


import com.google.gson.annotations.SerializedName

/**
 * 
 * @param id 
 * @param pet_id 
 * @param quantity 
 * @param ship_date 
 * @param status Order Status
 * @param complete 
 */
data class OrderJson (
    @SerializedName("id") val id: Long,
    @SerializedName("pet_id") val petId: Long,
    @SerializedName("quantity") val quantity: Int,
    @SerializedName("ship_date") val shipDate: java.time.LocalDateTime,
    @SerializedName("status") val status: String,
    @SerializedName("complete") val complete: Boolean
)
