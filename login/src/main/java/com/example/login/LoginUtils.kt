package com.example.login

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.lifecycle.MutableLiveData
import com.firebase.ui.auth.AuthUI
import com.firebase.ui.auth.ErrorCodes
import com.firebase.ui.auth.IdpResponse
import com.google.firebase.FirebaseException
import com.google.firebase.auth.PhoneAuthCredential
import com.google.firebase.auth.PhoneAuthProvider
import java.sql.Time
import java.util.concurrent.TimeUnit

object LoginUtils {

    const val RC_LOG_IN = 2001

    fun loginUsingPhoneNo(activity: Activity) {

        val providers = arrayListOf(
            AuthUI.IdpConfig.PhoneBuilder()
                .setDefaultCountryIso("IN")
                .build()
        )
        startActivityForResult(
            activity,
            AuthUI.getInstance()
                .createSignInIntentBuilder()
                .setAvailableProviders(providers)
                .build(),
            RC_LOG_IN, null
        )
    }

    fun handleLoginError(context: Context,data: Intent?) {
        data?.let {
            val response = IdpResponse.fromResultIntent(it)
            when (response?.error?.errorCode) {
                ErrorCodes.NO_NETWORK -> {
                    Toast.makeText(context, "No Network", Toast.LENGTH_SHORT)
                }
                ErrorCodes.PROVIDER_ERROR -> {
                    Toast.makeText(context, "Provider Error", Toast.LENGTH_SHORT)
                }
                ErrorCodes.UNKNOWN_ERROR -> {
                    Toast.makeText(context, "Unknown Error", Toast.LENGTH_SHORT)
                }
                else->{

                }
            }
        }

    }

}