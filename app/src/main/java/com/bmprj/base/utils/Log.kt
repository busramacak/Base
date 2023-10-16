package com.bmprj.base.utils

import android.app.Activity
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel


fun Activity.logE(msg:String?) = logError(this,msg)
fun Activity.logD(msg:String?) = logDebug(this,msg)
fun Activity.logI(msg: String?) = logInfo(this,msg)
fun Fragment.logE(msg: String?) = logError(this,msg)
fun Fragment.logD(msg: String?) = logDebug(this,msg)
fun Fragment.logI(msg: String?) = logInfo(this,msg)
fun ViewModel.logE(msg: String?) = logError(this,msg)
fun ViewModel.logD(msg: String?) = logDebug(this,msg)
fun ViewModel.logI(msg: String?) = logInfo(this,msg)

@JvmName("ActivityError")
private fun logError(activity: Activity,msg:String?){
    //get packageName in activity for Log tag
    val packageName = activity::class.simpleName
    msg?.let{ Log.e(packageName,msg)}
}
@JvmName("ActivityDebug")
private fun logDebug(activity: Activity,msg: String?){
    val packageName = activity::class.simpleName
    msg?.let { Log.d(packageName,msg) }
}
@JvmName("ActivityInfo")
private fun logInfo(activity: Activity,msg: String?){
    val packageName = activity::class.simpleName
    msg?.let { Log.i(packageName,msg) }
}
@JvmName("FragmentError")
private fun logError(fragment: Fragment,msg: String?){
    val packageName = fragment::class.simpleName
    msg?.let { Log.e(packageName,msg) }
}
@JvmName("FragmentDebug")
private fun logDebug(fragment: Fragment,msg: String?){
    val packageName = fragment::class.simpleName
    msg?.let { Log.d(packageName,msg) }
}
@JvmName("FragmentInfo")
private fun logInfo(fragment: Fragment,msg:String?){
    val packageName= fragment::class.simpleName
    msg?.let { Log.i(packageName,msg) }
}

@JvmName("ViewModelError")
private fun logError(viewModel: ViewModel,msg: String?){
    val packageName = viewModel::class.simpleName
    msg?.let { Log.e(packageName,msg) }
}
@JvmName("ViewModelDebug")
private fun logDebug(viewModel: ViewModel,msg: String?){
    val packageName = viewModel::class.simpleName
    msg?.let { Log.d(packageName,msg) }
}
@JvmName("ViewModelInfo")
private fun logInfo(viewModel: ViewModel,msg: String?){
    val packageName = viewModel::class.simpleName
    msg?.let { Log.i(packageName,msg) }
}