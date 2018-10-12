package com.legere.online.samplemachinetest.models.apis.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class CustomerData{
    @SerializedName("customer_mobile")
    @Expose
    private var customerMobile: String? = null
    @SerializedName("is_registered")
    @Expose
    private var isRegistered: Int? = null
    @SerializedName("otp")
    @Expose
    private var otp: Int? = null

    fun getCustomerMobile(): String? {
        return customerMobile
    }

    fun setCustomerMobile(customerMobile: String) {
        this.customerMobile = customerMobile
    }

    fun getIsRegistered(): Int? {
        return isRegistered
    }

    fun setIsRegistered(isRegistered: Int?) {
        this.isRegistered = isRegistered
    }

    fun getOtp(): Int? {
        return otp
    }

    fun setOtp(otp: Int?) {
        this.otp = otp
    }

}