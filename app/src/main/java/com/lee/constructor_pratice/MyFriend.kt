package com.lee.constructor_pratice

import android.util.Log

// 클래스 이름 : 내 친구
class MyFriend {

    val TAG: String = "로그"

    // 멤버 변수
    // 이름
    var name: String? = null

    // 나이
    var age: Int? = null

    // 결혼 여부
    var isMarried: Boolean? = null

    // 별명
    var nickname: String? = null

    // 기본 생성자
    init {
        Log.d(TAG, "MyFriend - init() called")

        name = "홍길동"
        age = 20
        isMarried = false
        nickname = "아부지~"

    }

}