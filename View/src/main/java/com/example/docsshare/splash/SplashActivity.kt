package com.example.docsshare.splash

import android.os.Bundle
import com.example.docsshare.BaseActivity
import com.example.docsshare.LoginBaseActivity
import com.example.docsshare.R

class SplashActivity : LoginBaseActivity() {

    //region Activity lifecycle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    //endregion

    //region Method Implementation
    override fun getLayoutResourceId() = R.layout.activity_splash_screen
    //endregion
}