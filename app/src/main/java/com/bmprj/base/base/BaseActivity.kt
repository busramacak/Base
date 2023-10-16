package com.bmprj.base.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<VDB:ViewDataBinding>(private val layout:Int) : AppCompatActivity() {

    private lateinit var _binding: VDB
    protected val binding get() = _binding
    abstract fun initView()

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        _binding=DataBindingUtil.setContentView(this,layout)
        initView()
    }
}