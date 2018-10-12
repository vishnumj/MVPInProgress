package com.legere.online.samplemachinetest.utils

import android.content.Context
import android.preference.PreferenceManager
import com.legere.online.samplemachinetest.SampleApplication
import com.legere.online.samplemachinetest.base.activity.BaseActivity

class SharedPreferencesHelper(var mContext: Context) {

    companion object {
        var mSharedPreferencesHelper: SharedPreferencesHelper? = null
        fun getInstance(): SharedPreferencesHelper? {
            if (mSharedPreferencesHelper == null) {
                mSharedPreferencesHelper = SharedPreferencesHelper(SampleApplication.context!!)
            }
            return mSharedPreferencesHelper
        }
    }


    fun putInt(key: String, value: Int) {
        val preferences = PreferenceManager
                .getDefaultSharedPreferences(mContext)
        val edit = preferences.edit()
        edit.putInt(key, value)
        edit.commit()
    }


    fun putBoolean(key: String, `val`: Boolean) {
        val preferences = PreferenceManager
                .getDefaultSharedPreferences(mContext)
        val edit = preferences.edit()
        edit.putBoolean(key, `val`)
        edit.commit()
    }


    fun putString(key: String, `val`: String) {
        val preferences = PreferenceManager
                .getDefaultSharedPreferences(mContext)
        val edit = preferences.edit()
        edit.putString(key, `val`)
        edit.commit()

    }

    fun putFloat(key: String, `val`: Float) {
        val preferences = PreferenceManager
                .getDefaultSharedPreferences(mContext)
        val edit = preferences.edit()
        edit.putFloat(key, `val`)
        edit.commit()
    }

    fun putLong(key: String, `val`: Long) {
        val preferences = PreferenceManager
                .getDefaultSharedPreferences(mContext)
        val edit = preferences.edit()
        edit.putLong(key, `val`)
        edit.commit()
    }


    fun getLong(key: String, _default: Long): Long {
        val preferences = PreferenceManager
                .getDefaultSharedPreferences(mContext)
        return preferences.getLong(key, _default)
    }

    fun getFloat(key: String, _default: Float): Float {
        val preferences = PreferenceManager
                .getDefaultSharedPreferences(mContext)
        return preferences.getFloat(key, _default)
    }

    fun getString(key: String, _default: String): String? {
        val preferences = PreferenceManager
                .getDefaultSharedPreferences(mContext)
        return preferences.getString(key, _default)
    }

    fun getInt(key: String, _default: Int): Int {
        val preferences = PreferenceManager
                .getDefaultSharedPreferences(mContext)
        return preferences.getInt(key, _default)
    }

    fun getBoolean(key: String, _default: Boolean): Boolean {
        val preferences = PreferenceManager
                .getDefaultSharedPreferences(mContext)
        return preferences.getBoolean(key, _default)
    }

    fun clearPreferences() {
        val preferences = PreferenceManager
                .getDefaultSharedPreferences(mContext)

        preferences.edit().clear().commit()
    }

}