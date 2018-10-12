package com.legere.online.samplemachinetest.login.view

import com.legere.online.samplemachinetest.base.views.IBaseView

interface ILoginview : IBaseView {
    fun onLoginSucess(motptoken: String)
    fun OnLoginFailure(mStrError: String)
}