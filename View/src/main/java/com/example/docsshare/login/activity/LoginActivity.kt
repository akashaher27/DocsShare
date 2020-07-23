package com.example.docsshare.login.activity

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.example.docsshare.LoginBaseActivity
import com.example.docsshare.R
import com.example.login.LoginUtils
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : LoginBaseActivity() {

    companion object {

        fun launchActivity(context: Context): Intent {
            return Intent(context, LoginActivity::class.java)
        }
    }

    //region Activity lifecycle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
        setupListener()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            LoginUtils.RC_LOG_IN -> {
                processLoginResult(requestCode, data)
            }
        }
    }

    //endregion

    //region Method Implementation
    override fun getLayoutResourceId() = R.layout.activity_login
    //endregion

    //region Private method

    private fun setupListener() {
        btLogIn.setOnClickListener {
            LoginUtils.loginUsingPhoneNo(this)
        }
    }

    private fun initView() {

    }

    private fun processLoginResult(requestCode: Int, data: Intent?) {
        if (requestCode == Activity.RESULT_OK) {

        } else
            LoginUtils.handleLoginError(this,data)
    }

    //endregion
}
