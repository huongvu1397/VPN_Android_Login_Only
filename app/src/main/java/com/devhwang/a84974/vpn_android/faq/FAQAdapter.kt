package com.devhwang.a84974.vpn_android.faq

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.ExpandableListView
import android.widget.TextView
import com.devhwang.a84974.vpn_android.R

class FAQAdapter(var context:Context,var expandableListView: ExpandableListView,var header: MutableList<String>,var body:MutableList<MutableList<String>>): BaseExpandableListAdapter() {
    override fun getGroup(p0: Int): String  {
        return header[p0]
    }

    override fun isChildSelectable(p0: Int, p1: Int): Boolean {
        return true
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun getGroupView(p0: Int, p1: Boolean, p2: View?, p3: ViewGroup?): View? {
        var convertView = p2
        if(convertView==null){
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.item_group_expandable_listview,null)
        }
        val mTextTitleExpandable = convertView?.findViewById<TextView>(R.id.mTextTitleExpandable)
        mTextTitleExpandable?.text = getGroup(p0)
        return convertView
    }

    override fun getChildrenCount(p0: Int): Int {
        return body[p0].size
    }

    override fun getChild(p0: Int, p1: Int): String {
        return body[p0][p1]
    }

    override fun getGroupId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getChildView(p0: Int, p1: Int, p2: Boolean, p3: View?, p4: ViewGroup?): View? {
        var convertView = p3
        if(convertView==null){
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.item_child_expandable_listview,null)
        }
        val mTextBodyExpandable = convertView?.findViewById<TextView>(R.id.mTextBodyExpandable)
        mTextBodyExpandable?.text = getChild(p0,p1)
        return convertView
    }

    override fun getChildId(p0: Int, p1: Int): Long {
        return p1.toLong()
    }

    override fun getGroupCount(): Int {
        return header.size
    }
}