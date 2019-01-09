package com.devhwang.a84974.vpn_android.faq

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.devhwang.a84974.vpn_android.R
import kotlinx.android.synthetic.main.fragment_faq.*


class FragmentFAQ:Fragment() {

    val header : MutableList<String> = ArrayList();
    val body : MutableList<MutableList<String>> = ArrayList();

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_faq, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fakeData()
    }

    private fun fakeData() {
        val whydo : MutableList<String> = ArrayList()
        whydo.add(getString(R.string.whydo))

        val whatis : MutableList<String> = ArrayList()
        whatis.add(getString(R.string.whydo))

        val icant : MutableList<String> = ArrayList()
        icant.add(getString(R.string.whydo))

        val willvpn : MutableList<String> = ArrayList()
        willvpn.add(getString(R.string.whydo))

        val apps : MutableList<String> = ArrayList()
        apps.add(getString(R.string.whydo))

        header.add(getString(R.string.whydoi))
        header.add(getString(R.string.whydoi))
        header.add(getString(R.string.whydoi))
        header.add(getString(R.string.whydoi))
        header.add(getString(R.string.whydoi))

        body.add(whydo)
        body.add(whatis)
        body.add(icant)
        body.add(willvpn)
        body.add(apps)

        mExpanableListView.setAdapter(FAQAdapter(context!!,mExpanableListView,header,body))


    }
}