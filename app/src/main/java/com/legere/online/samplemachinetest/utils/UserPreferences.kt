package com.legere.online.samplemachinetest.utils

class UserPreferences {

    companion object {
        var mUserPreferences: UserPreferences? = null
        fun getInstance(): UserPreferences {
            if (mUserPreferences == null) {
                mUserPreferences = UserPreferences()
            }
            return mUserPreferences!!
        }
    }

    fun getUserToken(): String? {
        return SharedPreferencesHelper.getInstance()?.getString(ConstantValues.SharedPrefs.USER_TOKEN, "")
    }
}