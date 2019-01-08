package com.devhwang.a84974.vpn_android.Login.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.devhwang.a84974.vpn_android.Login.item.SignInFragment
import com.devhwang.a84974.vpn_android.Login.item.SignUpFragment

class MyPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(p0: Int): Fragment {
        return when (p0) {
            0 -> {
                SignInFragment()
            }
            1 -> SignUpFragment()
            else -> {
                return SignInFragment()
            }
        }
    }

    override fun getCount(): Int {
        return 2;
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "SIGN IN"
            1 -> "SIGN UP"
            else -> {
                return "SIGN IN"
            }
        }
    }


}