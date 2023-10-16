package com.bmprj.base.utils

import android.app.Activity
import android.content.Context
import android.widget.Toast
import androidx.fragment.app.Fragment

fun Activity.toast(msg:String?) = toast(this,msg)
fun Activity.toast(msg: Int?) = toast(this,msg)
fun Activity.toastLong(msg: String?) = toastLong(this,msg)
fun Activity.toastLong(msg: Int?) = toastLong(this,msg)

fun Fragment.toast(msg: String?) = toast(requireContext(),msg)
fun Fragment.toast(msg: Int?) = toast(requireContext(),msg)
fun Fragment.toastLong(msg: String?) = toastLong(requireContext(),msg)
fun Fragment.toastLong(msg: Int?) = toastLong(requireContext(),msg)

@JvmName("toastString")
private fun toast(context:Context,msg: String?,duration:Int = Toast.LENGTH_SHORT) = msg?.let {
    Toast.makeText(context,msg,duration).show()
}
@JvmName("toastInt")
private fun toast(context: Context,msg: Int?,duration: Int= Toast.LENGTH_SHORT) = msg?.let {
    Toast.makeText(context,msg,duration).show()
}

@JvmName("toastLongString")
private fun toastLong(context: Context,msg: String?,duration: Int = Toast.LENGTH_LONG) = msg?.let {
    Toast.makeText(context,msg,duration).show()
}
@JvmName("toastLongInt") //It can also be done as above or below. The bottom one is more useful
private fun toastLong(context: Context,msg: Int?,duration: Int=Toast.LENGTH_LONG) = toast(context,msg,duration)

