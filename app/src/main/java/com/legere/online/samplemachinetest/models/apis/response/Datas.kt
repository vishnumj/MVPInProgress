package com.legere.online.samplemachinetest.models.apis.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class Datas {
    @SerializedName("customer_data")
    @Expose
    private var customerData: List<CustomerData>? = null
    @SerializedName("api_token")
    @Expose
    private var apiToken: String? = null

    fun getCustomerData(): List<CustomerData>? {
        return customerData
    }

    fun setCustomerData(customerData: List<CustomerData>) {
        this.customerData = customerData
    }

    fun getApiToken(): String? {
        return apiToken
    }

    fun setApiToken(apiToken: String) {
        this.apiToken = apiToken
    }

}