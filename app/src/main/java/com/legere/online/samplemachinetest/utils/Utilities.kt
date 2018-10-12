package com.legere.online.samplemachinetest.utils

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor


class Utilities {
    companion object {
        var utilityObjects: Utilities? = null
        fun getInstance(): Utilities {
            if (utilityObjects == null) {
                utilityObjects = Utilities()

            }
            return utilityObjects!!
        }
    }

    private var mOddexoService: ApiInterfaces? = null

    fun getService(): ApiInterfaces {

        if (mOddexoService == null) {
            val interceptor = HttpLoggingInterceptor()
            interceptor.level = HttpLoggingInterceptor.Level.BODY
            val client = OkHttpClient.Builder().addInterceptor(interceptor).build()

            val retrofit = Retrofit.Builder()
                    .baseUrl(ConstantValues.BASE_URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            mOddexoService = retrofit.create(ApiInterfaces::class.java)
        }
        return mOddexoService!!
    }

}