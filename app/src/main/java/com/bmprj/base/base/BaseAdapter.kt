package com.bmprj.base.base

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

abstract class BaseAdapter<VDB:ViewDataBinding,T:Any>(
    open var list:ArrayList<T> = arrayListOf()
):RecyclerView.Adapter<BaseViewHolder<VDB>>() {

    @get:LayoutRes
    abstract val layoutId:Int

    abstract fun bind(binding: VDB,item:T)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<VDB> {
        val binder = DataBindingUtil.inflate<VDB>(LayoutInflater.from(parent.context),layoutId,parent,false)
        return BaseViewHolder(binder)
    }

    override fun getItemCount():Int = list.size

    override fun onBindViewHolder(holder: BaseViewHolder<VDB>, position: Int) {
        bind(holder.binder,list[position])
    }

//    fun updateList(newList:List<T>){
//        list.clear()
//        list.addAll(newList)
//        notifyDataSetChanged()
//    }
}