package com.lee.constructor_pratice

import android.provider.ContactsContract.CommonDataKinds.Nickname
import android.util.Log

// 추가 생성자로 되어있는 친구 클래스
class MyFriendWithMoreParams() {

    val TAG: String = "로그"

    // 멤버변수
    var name: String? = null
    var age: Int? = null
    var isMarried: Boolean? = null
    var nickname: String? = null

    // 기본 생성자
    init {
        Log.d(TAG, "MyFriendWithMoreParams - init() called")
        this.name = "기본값"
    }

    // 추가 생성자
    // 기본 생성자가 있어야한다.
    constructor(name: String) : this() {
        Log.d(TAG, "MyFriendWithMoreParams - name 생성자() called")
        this.name = name
    }

    // 추가 생성자
    constructor(name: String, age: Int) : this() {
        Log.d(TAG, "MyFriendWithMoreParams - name, age 생성자() called")
        this.name = name
        this.age = age
    }

    // 추가 생성자
    constructor(name: String, age: Int, isMarried: Boolean) : this() {
        Log.d(TAG, "MyFriendWithMoreParams - name, age, isMarried 생성자() called")
        this.name = name
        this.age = age
        this.isMarried = isMarried
    }

    // 추가 생성자
    constructor(name: String, age: Int, isMarried: Boolean, nickname: String) : this() {
        Log.d(TAG, "MyFriendWithMoreParams - name, age, isMarried, nickname 생성자() called")
        this.name = name
        this.age = age
        this.isMarried = isMarried
        this.nickname = nickname
    }
}