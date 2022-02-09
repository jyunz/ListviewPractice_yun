package com.example.listviewpractice_yun.adaptes

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.listviewpractice_yun.R
import com.example.listviewpractice_yun.datas.Student

class StudentAdapter(
    val mContext: Context,
    val resId:Int,
    val mList : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mList) {
//res 파일의 누구(ID)를 불러 올꺼니
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.student_list_item,null)
        }
        val row = tempRow!!
        //temprow가 절대 null이 아니다!!

        return row
        //완성된 결과=row

    }
}