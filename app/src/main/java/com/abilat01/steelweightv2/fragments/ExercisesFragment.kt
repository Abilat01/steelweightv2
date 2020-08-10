package com.abilat01.steelweightv2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.abilat01.steelweightv2.MyAdapter
import com.abilat01.steelweightv2.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_main_list.*


class ExercisesFragment : Fragment(R.layout.fragment_exercises) {

    private lateinit var mRecyclerView: RecyclerView
    private lateinit var mMyAdapter: MyAdapter

    override fun onResume() {
        super.onResume()
        initRecyclerView()
    }

    private fun initRecyclerView() {
        mRecyclerView = main_list_recycle_view
        mMyAdapter = MyAdapter()
        //И хули дальше?)

        mRecyclerView.adapter = mMyAdapter
    }
}