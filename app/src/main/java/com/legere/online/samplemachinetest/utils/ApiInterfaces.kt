package com.legere.online.samplemachinetest.utils

import com.legere.online.samplemachinetest.models.apis.response.LoginResponse
import retrofit2.Call
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiInterfaces {
    @POST("verify_mobile")
    fun getLoginDetails(@Query("mobile") mNumber: String, @Query("code ") mCode: String): Call<LoginResponse>
}