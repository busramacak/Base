package com.bmprj.base.base

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

class BaseViewHolder<VDB:ViewDataBinding>(val binder:VDB) : RecyclerView.ViewHolder(binder.root)