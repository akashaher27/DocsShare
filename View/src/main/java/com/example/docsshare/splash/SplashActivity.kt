package com.example.docsshare.splash

import android.os.Bundle
import com.example.docsshare.LoginBaseActivity
import com.example.docsshare.R
import com.example.docsshare.login.activity.LoginActivity

class SplashActivity : LoginBaseActivity() {

    //region Activity lifecycle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onResume() {
        super.onResume()
        startActivity(LoginActivity.launchActivity(this))
        finish()
    }
    //endregion

    //region Method Implementation
    override fun getLayoutResourceId() = R.layout.activity_splash_screen
    //endregion
}