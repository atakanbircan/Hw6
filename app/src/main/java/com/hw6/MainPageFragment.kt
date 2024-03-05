package com.hw6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.hw6.adapter.ChildAdapter
import com.hw6.adapter.FirstRvAdapter
import com.hw6.adapter.OneCikanRvAdapter
import com.hw6.adapter.TurAdapter
import com.hw6.databinding.FragmentMainPageBinding
import com.hw6.model.Button
import com.hw6.model.ChildItem
import com.hw6.model.ContentGain
import com.hw6.model.TurItem

class MainPageFragment : Fragment() {

    private lateinit var binding : FragmentMainPageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainPageBinding.inflate(inflater, container, false)



        val contentList = ArrayList<ContentGain>()
        val c1 = ContentGain(1,"The Playboy Murders","Genel İzleyici",2,"playboy")
        val c2 = ContentGain(2,"Sanditon","Genel İzleyici",2,"sanditon")
        val c3 = ContentGain(3,"Gör Beni","Genel İzleyici",3,"gorbeni")
        val c4 = ContentGain(4,"Açık Mikrofon","Genel İzleyici",1,"acikmikrofon")
        contentList.add(c1)
        contentList.add(c2)
        contentList.add(c3)
        contentList.add(c4)



        val imageList = ArrayList<String>()
        imageList.add("onecikan1")
        imageList.add("onecikan2")
        imageList.add("onecikan3")
        imageList.add("onecikan4")

        val imageListYakinda =  ArrayList<String>()
        imageListYakinda.add("yakinda1")
        imageListYakinda.add("yakinda2")
        imageListYakinda.add("yakinda3")
        imageListYakinda.add("yakinda4")

        val contentAdapter = FirstRvAdapter(requireContext(),contentList)
        binding.rcView1.adapter = contentAdapter
        binding.rcView1.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)


        val higlightsAdapter = OneCikanRvAdapter(requireContext(),imageList)
        binding.rvOneCikanlar.adapter = higlightsAdapter
        //binding.rvOneCikanlar.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        binding.rvOneCikanlar.layoutManager = SlowlyLinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
        //val snapHelper = LinearSnapHelper()
        //snapHelper.attachToRecyclerView(binding.rvOneCikanlar)

        val rvYeniAdapter = ChildAdapter(requireContext(),imageListYakinda)
        binding.rvYeniEklenenler.adapter = rvYeniAdapter
        binding.rvYeniEklenenler.layoutManager = SlowlyLinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)


        return binding.root
    }


}