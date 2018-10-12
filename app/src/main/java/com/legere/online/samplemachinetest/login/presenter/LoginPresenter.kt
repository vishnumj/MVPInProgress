package com.legere.online.samplemachinetest.login.presenter

import android.content.Context
import com.legere.online.samplemachinetest.R
import com.legere.online.samplemachinetest.login.intercepter.LoginInteractor
import com.legere.online.samplemachinetest.login.intercepter.LoginInteractorListiner
import com.legere.online.samplemachinetest.login.view.ILoginview

class LoginPresenter(var mIloginviewobj: ILoginview) : LoginInteractorListiner {
    override fun onLoignInteractorlistner_Sucess(motp: String) {
        mIloginviewobj.onLoginSucess(motp)

    }

    override fun onLogininteratorlistiner_Failure(mErrorstr: String) {
        mIloginviewobj.OnLoginFailure(mErrorstr)
    }

    var mlogininInteractorobj = LoginInteractor(this)
    fun initUserLogIn(mLoginnumber: String) {
        if (!isNumberValied(mLoginnumber)) {
            mIloginviewobj.OnLoginFailure(mIloginviewobj.getStringFromResource(R.string.invalid_login_error))
        } else {
            mlogininInteractorobj.initLogin(mLoginnumber)
        }

    }

    private fun isNumberValied(mLoginnumber: String): Boolean {
        return mLoginnumber.length == 8
    }

}