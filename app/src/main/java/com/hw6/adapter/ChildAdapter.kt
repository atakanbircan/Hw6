package com.hw6.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hw6.databinding.ChildItemBinding
import com.hw6.model.ChildItem

class ChildAdapter(var mContext: Context, val childList : List<String>)
    : RecyclerView.Adapter<ChildAdapter.ChildViewHolder>(){

        inner class ChildViewHolder(var design : ChildItemBinding) : RecyclerView.ViewHolder(design.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildViewHolder {
        val binding = ChildItemBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return ChildViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return childList.size
    }

    override fun onBindViewHolder(holder: ChildViewHolder, position: Int) {
        val child = childList.get(position)
        val c = holder.design

        c.imgChild.setImageResource(
            //mContext.resources.getIdentifier(child.img,"drawable",mContext.packageName))
            mContext.resources.getIdentifier(child,"drawable",mContext.packageName))
    }
}