package com.bmprj.base.ui

import android.widget.Toast
import com.bmprj.base.R
import com.bmprj.base.base.BaseActivity
import com.bmprj.base.databinding.ActivityMainBinding
import com.bmprj.base.utils.toast

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    override fun initView() {
        supportFragmentManager.beginTransaction().replace(R.id.fragmentTut1, BlankFragment()).commit()
    }
}