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

//    ㄴ 어댑터의 주 생성자에서 필요한 재료를 받자
//      array adapter는 어떤 종류의 데이터를 목록으로 받아서 화면에 뿌려줄지 꺽쇠에 넣어서 알려줘야 함
//      redId는 res 파일의 누구(ID)를 불러 올꺼니 라는 뜻
//      전달받은 리스트 내용이 mList에 들어가있음.
//    스튜던트 리스트 아이템과 스튜던트 클래스를 결합하는 것을 여기서 하는것.멤버변수로 생성

    val inf = LayoutInflater.from(mContext)

//  getView가 뿌려주는 역할
//    getView는 convertView라는 변수를 가지고 와서 실행하기 때문에 convertView를 검사를 한번 해줌
//    그래서 검사를 위한 내용이 들어감

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.student_list_item,null)
//            null->부가 정보가 아직 없다는 뜻
        }


        val row = tempRow!!
        //temprow가 null이면 채워주라고 했기 때문에 여기서는 절대 null이 아니다!!

        val studentData = mList[position]


    // 꺽쇠<>의 의미는 찾아내고 싶은 종류를 결정하는 것.
        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)


        val birthYearText = row.findViewById<TextView>(R.id.birthYearTxt)

        nameTxt.text = studentData.name

//       출생년도를 가지고 => (2021년 한국기준)나이로 변환해서 보여주기.
        val koreanAge = 2021 - studentData.birthYear + 1

//        birthYearText.text = "(${studentData.birthYear}년생)"
//       00년생이 아니라 00살로 표현할때
        birthYearText.text =  "(${koreanAge}세)"
        return row
        //완성된 결과=row

    }
}