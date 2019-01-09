package com.solarvpn.turbovpn.hotspotshield.ui.modules.setting.instruction

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.devhwang.a84974.vpn_android.R


class FragmentInstructionFinally: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v: View = LayoutInflater.from(activity!!).inflate(R.layout.fragment_instruction_finally,container,false)
        return v
    }
}