package com.bmprj.base.ui

import com.bmprj.base.R
import com.bmprj.base.base.BaseFragment
import com.bmprj.base.databinding.FragmentBlankBinding

class BlankFragment : BaseFragment<FragmentBlankBinding>(R.layout.fragment_blank){
    override fun initView() {
        binding.txt.text=getString(R.string.app_name)
    }
}