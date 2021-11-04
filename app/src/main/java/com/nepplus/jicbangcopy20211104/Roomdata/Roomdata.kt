package com.nepplus.jicbangcopy20211104.Roomdata

import java.text.NumberFormat
import java.util.*

class Roomdata(val price: Int, val address: String,val floor: Int, val description: String) {

    //    함수작성
    fun getFormattedPrice(): String {

        if (this.price < 10000) {
            val priceStr = NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)
            return priceStr
        } else {

            val uk = this.price/10000
            val rest = this.price%10000
            val restComma = NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)
            val priceStr = "${uk}억 ${restComma}"

            return priceStr
        }

        }

//    층수를 가공하는 함수

    fun getFormattedFloor() :String {

        fun getFormattedFloor() : String {

            if (this.floor > 0) {
                return "${this.floor}층"
            }
            else if (this.floor == 0) {
                return "반지하"
            }
            else {
                return "지하 ${-this.floor}층"


        }

    }

    }