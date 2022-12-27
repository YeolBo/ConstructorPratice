package com.lee.constructor_pratice

import android.util.Log

// 매게변수를 가지는 친구 클래스
class MyFriendWithParams(
    var name: String?,
    var age: Int?,
    var isMarried: Boolean?,
    var nickname: String?
) {

    val TAG: String = "로그"

    var address: String = ""

    // 메모리에 올라갈때 실행
    // 외부에서 값이 들어와도 기본생성자가 출력
    init {
        Log.d(TAG, "MyFriendWithParams - init() called")
        this.name = "할아범"
        this.age = 100
        this.isMarried = true
        this.nickname = "꼰대"
    }

    // 추가 생성자
    constructor(
        name: String?,
        age: Int?,
        isMarried: Boolean?,
        nickname: String?,
        address: String
    ) : this(name, age, isMarried, nickname) {

        this.address = address
    }
}