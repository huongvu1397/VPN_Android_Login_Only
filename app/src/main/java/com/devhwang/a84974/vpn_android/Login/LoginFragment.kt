package com.devhwang.a84974.vpn_android.Login

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.devhwang.a84974.vpn_android.interfaces.IManagerFragment
import com.devhwang.a84974.vpn_android.Login.adapter.MyPagerAdapter
import com.devhwang.a84974.vpn_android.R
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {
    var iManagerFragment: IManagerFragment? = null

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        this.iManagerFragment = context as? IManagerFragment
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // tab layout
        val fragmentAdapter =
            MyPagerAdapter(activity!!.supportFragmentManager)
        mViewPager.adapter = fragmentAdapter
        mTabLayout.setupWithViewPager(mViewPager)
    }
}