package com.example.listviewpractice_yun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.listviewpractice_yun.adaptes.StudentAdapter
import com.example.listviewpractice_yun.datas.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //멤버변수- 보통 m을 붙여서 네이밍함
    val mStudentList =ArrayList<Student>()
    //나중에 채워넣는 변수
    lateinit var mAdapter : StudentAdapter

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

        mAdapter = StudentAdapter(this,R.layout.student_list_item,mStudentList)

        studentListView.adapter = mAdapter
        
        studentListView.setOnItemClickListener { parent, view, position, id -> 
            
            val clickedStudent = mStudentList[position]

            Toast.makeText(this, "${clickedStudent.name} 이 클릭 됨.", Toast.LENGTH_SHORT).show()
            
        }

        studentListView.setOnItemLongClickListener { parent, view, position, id ->

            mStudentList.removeAt(position)

            //삭제되고나면 내용을 변경한걸 다시 반영
            mAdapter.notifyDataSetChanged()

//            val longClickedStudent = mStudentList[position]
//            Toast.makeText(this, "${longClickedStudent.name}길게 클릭됨", Toast.LENGTH_SHORT).show()
//           롱클릭리스너 전용인가? 맞아(true)
//            아니야, false(롱클릭과 일반 클릭 효과가 중첩됨)
            return@setOnItemLongClickListener true



        }
    }
}