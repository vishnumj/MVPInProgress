package com.legere.online.samplemachinetest.login.intercepter

interface LoginInteractorListiner {
    fun onLoignInteractorlistner_Sucess(motp:String)
    fun onLogininteratorlistiner_Failure(mErrorstr: String)
}