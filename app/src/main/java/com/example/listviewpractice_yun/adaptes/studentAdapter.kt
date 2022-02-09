package com.example.listviewpractice_yun.adaptes

import android.content.Context
import android.widget.ArrayAdapter
import com.example.listviewpractice_yun.datas.Student

class studentAdapter(
    val mContext: Context,
    val resId:Int,
    val mList : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mList) {
}