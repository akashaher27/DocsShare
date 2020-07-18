package com.example.docsshare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

abstract class BaseActivity : AppCompatActivity() {


    //region Activity lifecycle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResourceId()!!)
    }
    //endregion

    //region Abstract class
    abstract fun getLayoutResourceId(): Int?
    //endregion

}
