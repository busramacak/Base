package com.bmprj.base.utils

import android.app.Activity
import android.content.Context
import android.widget.Toast


fun Activity.toast(msg:String?) = toast(this,msg)
fun Activity.toast(msg: Int?)

private fun toast(context:Context,msg: String?,duration:Int = Toast.LENGTH_SHORT) = msg?.let {
    Toast.makeText(context,msg,duration).show()
}