package com.solarvpn.turbovpn.hotspotshield.ui.modules.setting.instruction

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.devhwang.a84974.vpn_android.R

import kotlinx.android.synthetic.main.fragment_instruction_for_you.*
import me.relex.circleindicator.CircleIndicator



class FragmentInstruction: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_instruction_for_you, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fragmentAdapter =
            InstructionAdapter(activity!!.supportFragmentManager)
        mViewPagerInstruction.adapter = fragmentAdapter
        val indicator = view.findViewById(R.id.indicator) as CircleIndicator
        indicator.setViewPager(mViewPagerInstruction)

    }

}