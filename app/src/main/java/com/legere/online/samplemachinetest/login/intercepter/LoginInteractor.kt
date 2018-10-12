package com.legere.online.samplemachinetest.login.intercepter

import com.legere.online.samplemachinetest.models.apis.response.LoginResponse
import com.legere.online.samplemachinetest.utils.Utilities
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginInteractor(var loginInteractorobj: LoginInteractorListiner) {
    fun initLogin(mPhoneno: String) {
        Utilities.getInstance().getService().getLoginDetails(mPhoneno, "965").enqueue(object : Callback<LoginResponse> {
            override fun onFailure(call: Call<LoginResponse>?, t: Throwable?) {
                loginInteractorobj.onLogininteratorlistiner_Failure(t!!.message.toString())
            }

            override fun onResponse(call: Call<LoginResponse>?, response: Response<LoginResponse>?) {
                try {
                    var mloginresponse = response!!.body()
                    var otpstring:String? = mloginresponse.getData()!![0].getCustomerData()!![0].getOtp().toString()
                    loginInteractorobj.onLoignInteractorlistner_Sucess(otpstring!!)

                } catch (e: Exception) {
                    loginInteractorobj.onLogininteratorlistiner_Failure(e!!.message.toString())
                }

            }

        })
    }
}