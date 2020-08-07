package com.hemendra.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var list = arrayListOf<String>()
        list.add("Hyderabad")
        list.add("bangalore")
        list.add("Chennai")
        list.add("pune")
        list.add("Delhi")

        lv.adapter= ListAdapter(this@MainActivity,list)
    }
}