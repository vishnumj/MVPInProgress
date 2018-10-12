package com.legere.online.samplemachinetest.login.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.legere.online.samplemachinetest.R
import com.legere.online.samplemachinetest.base.activity.BaseActivity
import com.legere.online.samplemachinetest.login.presenter.LoginPresenter
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity(), ILoginview {

    override fun onLoginSucess(motptoken: String) {
        Toast.makeText(this@LoginActivity, motptoken, Toast.LENGTH_SHORT).show()
    }



    lateinit var mIloginpresenterobject: LoginPresenter

    override fun OnLoginFailure(mStrError: String) {
        Toast.makeText(this@LoginActivity, mStrError, Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        mIloginpresenterobject = LoginPresenter(this)
        initView()
    }

    private fun initView() {
        login_login_bt.setOnClickListener {
            if (TextUtils.isEmpty(login_phone_et.text.toString())) {
                login_phone_et.error = getString(R.string.field_cannot_be_left_empty)
            } else {
                mIloginpresenterobject.initUserLogIn(login_phone_et.text.toString())
            }
        }

    }
}
