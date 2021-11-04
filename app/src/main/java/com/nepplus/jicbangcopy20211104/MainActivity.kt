package com.nepplus.jicbangcopy20211104

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.jicbangcopy20211104.RoomAdapter.RoomAdapter
import com.nepplus.jicbangcopy20211104.Roomdata.Roomdata
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRooms = ArrayList<Roomdata>()
    lateinit var mRoomAdapter : RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRooms.add(Roomdata(8000,"서울시 동대문구",5,"1번째 방입니다."))
        mRooms.add(Roomdata(18000,"서울시 서대문구",0,"2번째 방입니다."))
        mRooms.add(Roomdata(29700, "경기도 고양시",17,"3번째 방입니다"))
        mRooms.add(Roomdata(4300,"서울시 중구",-2,"4번째 방입니다"))
        mRooms.add(Roomdata(175300,"서울시 송파구",20,"다섯번째 방입니다"))

        mRoomAdapter = RoomAdapter(this,R.layout.roon_list_item, mRooms)

        roomListView.adapter =mRoomAdapter


    }
}