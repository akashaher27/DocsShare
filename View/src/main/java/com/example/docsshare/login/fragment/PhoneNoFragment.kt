package com.example.docsshare.login.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.docsshare.R
import com.example.login.LoginUtils
import kotlinx.android.synthetic.main.fragment_phone_no.*

class PhoneNoFragment : Fragment() {

    companion object {
        fun getInstance(): PhoneNoFragment {
            return PhoneNoFragment()
        }
    }

    //region Fragment lifecycle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_phone_no, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setListener()
    }

    //endregion

    //region Private Method
    private fun setListener() {
        btLogIn.setOnClickListener {
            verifyPhoneNo("+917756910227")
        }
    }

    private fun verifyPhoneNo(phoneNo: String) {
    }

    //endregion


}
