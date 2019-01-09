package com.solarvpn.turbovpn.hotspotshield.ui.modules.setting.instruction

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class InstructionAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(p0: Int): Fragment {
        return when (p0) {
            0 -> {
                FragmentInstructionFirst()
            }
            1 -> {
                FragmentInstructionSecond()
            }2 -> {
                FragmentInstructionThen()
            }3 -> {
                FragmentInstructionFinally()
            }
            else -> {
                return FragmentInstructionFirst()
            }
        }
    }

    override fun getCount(): Int {
        return 4
    }
}