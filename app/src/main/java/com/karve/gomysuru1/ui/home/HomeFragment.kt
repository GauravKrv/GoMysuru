package com.karve.gomysuru1.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.karve.gomysuru1.R
import com.karve.gomysuru1.adapter.HomeRecyclerListAdapter
import com.karve.gomysuru1.data.NewsFeed
import com.karve.gomysuru1.module.Topics

class HomeFragment : Fragment() {
   // lateinit var layoutManager: RecyclerView.LayoutManager


   // private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        /*homeViewModel =
                ViewModelProvider(this).get(HomeViewModel::class.java)*/
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        setHasOptionsMenu(true)
        //layoutManager = LinearLayoutManager(activity)
        val myDataset = NewsFeed().loadHeadlines()
      val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerList)
        recyclerView.adapter = HomeRecyclerListAdapter(requireContext(),myDataset)
        recyclerView?.setHasFixedSize(true)


        return view
    }

}