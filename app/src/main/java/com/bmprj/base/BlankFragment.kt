package com.bmprj.base

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bmprj.base.databinding.FragmentBlankBinding

class BlankFragment : BaseFragment<FragmentBlankBinding>(R.layout.fragment_blank){


    override fun getDataBinding() = FragmentBlankBinding.inflate(layoutInflater)

    override fun setUpViews() {
        super.setUpViews()
        binding.txt.text=getString(R.string.app_name)
    }
}