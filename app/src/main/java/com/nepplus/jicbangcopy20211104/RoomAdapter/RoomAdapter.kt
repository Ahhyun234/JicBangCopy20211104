package com.nepplus.jicbangcopy20211104.RoomAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.nepplus.jicbangcopy20211104.R
import com.nepplus.jicbangcopy20211104.Roomdata.Roomdata

class RoomAdapter( val mContext: Context, val resId : Int, val mList: ArrayList<Roomdata>)
    : ArrayAdapter<Roomdata>(mContext,resId,mList){


        val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null){
            tempRow = mInflater.inflate(R.layout.roon_list_item,null)
            }

        val row =tempRow!!


        val roomData = mList[position]

        val txtPrice = row.findViewById<TextView>(R.id.txtPrice)
        val txtAddressAndFloor = row.findViewById<TextView>(R.id.txtAddressAndFloor)
        val txtDescription = row.findViewById<TextView>(R.id.txtDescription)

        txtDescription.text = roomData.description
        txtPrice.text = roomData.getFormattedPrice()
        txtAddressAndFloor.text = "${roomData.address}, ${roomData.getFormattedFloor()}"

        return row
    }



}