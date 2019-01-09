package com.devhwang.a84974.vpn_android

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import com.devhwang.a84974.vpn_android.faq.FragmentFAQ
import com.devhwang.a84974.vpn_android.interfaces.IManagerFragment
import com.solarvpn.turbovpn.hotspotshield.ui.modules.setting.instruction.FragmentInstruction

class MainActivity : AppCompatActivity(), IManagerFragment {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initControl()
    }

    override fun nextToLoginFr(type: String?) {
        changeLayout(type);
    }

    private fun changeLayout(type: String?) {
        if (type.equals("MAIN")) {
            val mainFragment = MainFragment()
            pushFragment(mainFragment)
        }else if(type.equals("LOGIN")){
            val loginFragment = MainFragment()
            pushFragment(loginFragment)
        }
    }
    // khởi tạo
    private fun initControl() {
        val mainFragment = FragmentFAQ()
        pushFragment(mainFragment)
    }
    // replace fragment
    private fun pushFragment(fragment: Fragment) {
        val manager: FragmentManager = supportFragmentManager
        manager.beginTransaction()
            .replace(R.id.container, fragment)
            .commit()
    }

}
