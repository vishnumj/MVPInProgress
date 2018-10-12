package com.legere.online.samplemachinetest.base.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.legere.online.samplemachinetest.base.views.IBaseView
import com.legere.online.samplemachinetest.utils.SharedPreferencesHelper

open class BaseActivity : AppCompatActivity(), IBaseView {
    override fun getStringFromResource(mResource: Int): String {
        return getString(mResource)
    }

    var mSharedPreferencesHelper: SharedPreferencesHelper? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mSharedPreferencesHelper = SharedPreferencesHelper.getInstance()
    }

    fun getSharedPreferenceHelper(): SharedPreferencesHelper? {
        return mSharedPreferencesHelper
    }
}