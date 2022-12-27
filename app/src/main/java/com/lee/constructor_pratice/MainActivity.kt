package com.lee.constructor_pratice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val TAG: String = "로그"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "MainActivity - onCreate() called")

        val myFriend = MyFriend()

        Log.d(TAG, "MainActivity - myFriend: ${myFriend.name}")
        Log.d(TAG, "MainActivity - myFriend: ${myFriend.age}")
        Log.d(TAG, "MainActivity - myFriend: ${myFriend.isMarried}")
        Log.d(TAG, "MainActivity - myFriend: ${myFriend.nickname}")

        // 매게변수가 들어가는 생성자
        val myFriendChulsoo = MyFriendWithParams(
            "철수",
            20,
            false,
            "부자"
        )
        Log.d(TAG, "MainActivity - ${myFriendChulsoo.name}")
        Log.d(TAG, "MainActivity - ${myFriendChulsoo.age}")
        Log.d(TAG, "MainActivity - ${myFriendChulsoo.isMarried}")
        Log.d(TAG, "MainActivity - ${myFriendChulsoo.nickname}")

        // 매게변수가 들어가는 생성자
        val myFriendYoungSoo = MyFriendWithParams(
            "영수",
            30,
            true,
            "안녕",
            "대한민국"
        )
        Log.d(TAG, "MainActivity - ${myFriendYoungSoo.name}")
        Log.d(TAG, "MainActivity - ${myFriendYoungSoo.age}")
        Log.d(TAG, "MainActivity - ${myFriendYoungSoo.isMarried}")
        Log.d(TAG, "MainActivity - ${myFriendYoungSoo.nickname}")
        Log.d(TAG, "MainActivity - ${myFriendYoungSoo.address}")

        // 추가 생성자로 되어있는 친구 객체
        val myFriends = MyFriendWithMoreParams()
        Log.d(TAG, "MainActivity - ${myFriends.name}")

        val myFriendJames = MyFriendWithMoreParams("James")
        Log.d(TAG, "MainActivity - ${myFriendJames.name}")

        val myFriendJames_age = MyFriendWithMoreParams("James", 30)
        Log.d(TAG, "MainActivity - ${myFriendJames_age.name}")
        Log.d(TAG, "MainActivity - ${myFriendJames_age.age}")

        val myFriendJames_age_isMarried = MyFriendWithMoreParams(
            "James",
            30,
            true
        )
        Log.d(TAG, "MainActivity - ${myFriendJames_age_isMarried.name}")
        Log.d(TAG, "MainActivity - ${myFriendJames_age_isMarried.age}")
        Log.d(TAG, "MainActivity - ${myFriendJames_age_isMarried.isMarried}")

        val myFriendJames_age_isMarried_nickname = MyFriendWithMoreParams(
            "James",
            30,
            true,
            "뀨"
        )
        Log.d(TAG, "MainActivity - ${myFriendJames_age_isMarried_nickname.name}")
        Log.d(TAG, "MainActivity - ${myFriendJames_age_isMarried_nickname.age}")
        Log.d(TAG, "MainActivity - ${myFriendJames_age_isMarried_nickname.isMarried}")
        Log.d(TAG, "MainActivity - ${myFriendJames_age_isMarried_nickname.nickname}")
    }

}