package com.example.listviewpractice_yun.datas

import android.util.Log

// 학생 하위정보 - 이름, 출생년도

class Student(
    val name : String,
    val birthYear : Int) {

//    fun 함수이름(변수이름: 자료형, 변수이름2: 자료형2...) : 결과자료형 {
//     // 실제로 실행해줄 내용
//}
//fun sumTwoNumbers(num1: Int, num2: Int) : Int {
//     return num1+num2 // return으로 함수의 최종 결과값 지정
//}
//fun 함수이름() {
//     // 이 함수는 재료도 필요없고, 결과도 따로 없다. (void)
//}첫번째 중괄호 안에서 작성.

//      학생의 기능? 예시
//      이름으로 로그를 찍는 기능

//    function을 수행하기 위해 필요한 재료를 넣어주어야 함.(2가지) : Boolean(true/false로 결과값 나온다 return이 마지막에 있어야 함) {
    fun printMyNameToLog(num1 : Int, num2 : Double) : Boolean {
//        num1이 num2보다 크다면, 로그를 이름만,
//         그렇지 않다면, 이름과 인사도 로그에 출력.
        if (num1 > num2) {
            Log.d("연습용", this.name)

            Log.d("연습용","잘 부탁드립니다.")
        }

        return true
    }
}