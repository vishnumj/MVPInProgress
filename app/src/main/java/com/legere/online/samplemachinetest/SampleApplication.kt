package com.legere.online.samplemachinetest

import android.app.Application
import android.content.Context

class SampleApplication:Application()
{
    companion object {
        var context: Context? = null
    }


    override fun onCreate() {
        super.onCreate()
        SampleApplication.context = this
    }
}