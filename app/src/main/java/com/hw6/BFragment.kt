package com.hw6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.hw6.adapter.TurAdapter
import com.hw6.databinding.FragmentBBinding
import com.hw6.databinding.TurItemCardBinding
import com.hw6.model.ChildItem
import com.hw6.model.TurItem


class BFragment : Fragment() {
    private lateinit var binding: FragmentBBinding
    private val turrList = ArrayList<TurItem>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBBinding.inflate(inflater, container, false)

        addDataTodoListList()
        val turrAdapter = TurAdapter(requireContext(), turrList)
        binding.rvTurler.adapter = turrAdapter
        binding.rvTurler.layoutManager = SlowlyLinearLayoutManager(
            requireContext(),
            LinearLayoutManager.VERTICAL, false
        )



        binding.rvm
        return binding.root
    }

    private fun addDataTodoListList() {
        val childItem1 = ArrayList<ChildItem>()
        childItem1.add(ChildItem("onecikan1"))
        childItem1.add(ChildItem("onecikan2"))
        childItem1.add(ChildItem("onecikan3"))
        childItem1.add(ChildItem("onecikan4"))

        turrList.add(TurItem("Yeni Eklenenler", childItem1))

        val childItem2 = ArrayList<ChildItem>()
        childItem2.add(ChildItem("onecikan1"))
        childItem2.add(ChildItem("onecikan2"))
        childItem2.add(ChildItem("onecikan3"))
        childItem2.add(ChildItem("onecikan4"))

        turrList.add(TurItem("Yakında  GAİN'de!", childItem2))

        val childItem3 = ArrayList<ChildItem>()
        childItem3.add(ChildItem("onecikan1"))
        childItem3.add(ChildItem("onecikan2"))
        childItem3.add(ChildItem("onecikan3"))
        childItem3.add(ChildItem("onecikan4"))

        turrList.add(TurItem("GAİN Orjinal Komediler", childItem3))


    }
}