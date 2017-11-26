package com.kgmyshin.swagger.sample.api.json


import com.google.gson.annotations.SerializedName

/**
 * 
 * @param id 
 * @param username 
 * @param first_name 
 * @param last_name 
 * @param email 
 * @param password 
 * @param phone 
 * @param user_status User Status
 */
data class UserJson (
    @SerializedName("id") val id: Long,
    @SerializedName("username") val username: String,
    @SerializedName("first_name") val firstName: String,
    @SerializedName("last_name") val lastName: String,
    @SerializedName("email") val email: String,
    @SerializedName("password") val password: String,
    @SerializedName("phone") val phone: String,
    @SerializedName("user_status") val userStatus: Int
)
