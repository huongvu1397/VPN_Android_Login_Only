package com.devhwang.a84974.vpn_android.Login.item

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.devhwang.a84974.vpn_android.R
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_login.view.*

class SignUpFragment:Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v:View = LayoutInflater.from(activity!!).inflate(R.layout.fragment_sign_up,container,false)

        return v
    }

}