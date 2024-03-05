package com.hw6.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hw6.databinding.FirstRcvwCardBinding
import com.hw6.model.ContentGain

class FirstRvAdapter (var mContext: Context, var contentList: List<ContentGain>)
    :RecyclerView.Adapter<FirstRvAdapter.FirstRcvwCardTutucu>(){
        inner class FirstRcvwCardTutucu(var gDesign:FirstRcvwCardBinding) : RecyclerView.ViewHolder(gDesign.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirstRcvwCardTutucu {
        val binding = FirstRcvwCardBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return FirstRcvwCardTutucu(binding)
    }

    override fun getItemCount(): Int {
        return contentList.size
    }

    override fun onBindViewHolder(holder: FirstRcvwCardTutucu, position: Int) {
        val content = contentList.get(position)
        val t = holder.gDesign

        t.imgRcv1.setImageResource(
            mContext.resources.getIdentifier(content.image,"drawable",mContext.packageName))
        //t.txtRcv1.text = "${content.contentType}"
    }
}