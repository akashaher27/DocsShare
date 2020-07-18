package com.example.docsshare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.docsshare.R

open class LoginBaseActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun getLayoutResourceId(): Int? {
        return null
    }
}
