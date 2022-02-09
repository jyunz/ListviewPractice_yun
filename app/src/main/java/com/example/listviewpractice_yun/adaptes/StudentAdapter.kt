package com.example.listviewpractice_yun.adaptes

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.listviewpractice_yun.R
import com.example.listviewpractice_yun.datas.Student

class StudentAdapter(
    val mContext: Context,
    val resId:Int,
    val mList : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mList) {
//redId는 res 파일의 누구(ID)를 불러 올꺼니 라는 뜻
    //전달받은 리스트 내용이 mList에 들어가있음.
    val inf = LayoutInflater.from(mContext)
//getView가 뿌려주는 역할
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.student_list_item,null)
        }
        val row = tempRow!!
        //temprow가 절대 null이 아니다!!

        val studentData = mList[position]
    // 꺽쇠<>의 의미는 찾아내고 싶은 종류를 결정하는 것.
        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)


        val birthYearText = row.findViewById<TextView>(R.id.birthYearTxt)

        nameTxt.text = studentData.name

// 출생년도를 가지고 => (2021년 한국기준)나이로 변환해서 보여주기.
        val koreanAge = 2021 - studentData.birthYear + 1

//        birthYearText.text = "(${studentData.birthYear}년생)"
// 00년생이 아니라 00살로 표현할때
        birthYearText.text =  "(${koreanAge}세)"
        return row
        //완성된 결과=row

    }
}