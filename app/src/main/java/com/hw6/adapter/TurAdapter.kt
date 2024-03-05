package com.hw6.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hw6.SlowlyLinearLayoutManager
import com.hw6.databinding.TurItemCardBinding
import com.hw6.model.TurItem

class TurAdapter(var mContext: Context, val parentList : List<TurItem>)
    : RecyclerView.Adapter<TurAdapter.TurViewHolder>() {

    inner class TurViewHolder(var design : TurItemCardBinding) : RecyclerView.ViewHolder(design.root)




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TurViewHolder {
        val binding = TurItemCardBinding.inflate(LayoutInflater.from(mContext),parent, false)
        return TurViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return parentList.size
    }

    override fun onBindViewHolder(holder: TurViewHolder, position: Int) {
        val tur = parentList.get(position)
        holder.design.txtTurTitle.text = tur.title
        val childRecyclerView : RecyclerView = holder.design.langRecyclerView

        //childRecyclerView.setHasFixedSize(true)
       //childRecyclerView.layoutManager = GridLayoutManager(holder.itemView.context,3) //  bura sorun olabilir.
        //val childAdapter = ChildAdapter(mContext,parentList.get(position).mList)
        //childRecyclerView.adapter = childAdapter
        //childRecyclerView.layoutManager = SlowlyLinearLayoutManager(mContext,LinearLayoutManager.HORIZONTAL,false)

        }
}