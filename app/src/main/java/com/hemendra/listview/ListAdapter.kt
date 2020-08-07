package com.hemendra.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListAdapter(val context:Context,val datasource_list:ArrayList<String>):BaseAdapter()
{
    override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {
        val layoutinflater :LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val view =layoutinflater.inflate(R.layout.list_item,p2,false)

        val textView = view.findViewById(R.id.lv_item_tv) as TextView

        textView.text=datasource_list.get(position)

        return  view
    }

    override fun getItem(p0: Int): Any {
       return  datasource_list.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return datasource_list.size;
    }


}