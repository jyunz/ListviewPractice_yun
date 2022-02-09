package com.example.listviewpractice_yun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listviewpractice_yun.datas.Student

class MainActivity : AppCompatActivity() {

    //멤버변수

    val mStudentList =ArrayList<Student>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //목록에 뭔가 추가할꺼다.
        mStudentList.add( Student("윤지",1993))
        mStudentList.add( Student("김현상",1972))
        mStudentList.add( Student("고소영",1986))
        mStudentList.add( Student("전지현",1975))
        mStudentList.add( Student("쿠키몬",2010))
        mStudentList.add( Student("쿠마몬",1998))


    }
}