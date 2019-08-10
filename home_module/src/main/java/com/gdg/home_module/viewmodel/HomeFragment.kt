package com.gdg.home_module.viewmodel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.gdg.home_module.R
import com.gdg.home_module.databinding.HomeFragmentBinding
import com.gdg.home_module.view.EventAdapter
import kotlinx.android.synthetic.main.home_fragment.*
import org.koin.android.viewmodel.ext.android.viewModel


class HomeFragment : Fragment() {

    val viewModel: HomeViewModel by viewModel<HomeViewModel>()

    companion object {
        fun newInstance() = HomeFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val homeItemBinding: HomeFragmentBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.home_fragment, container, false)
        homeItemBinding.viewModel = viewModel
        homeItemBinding.setLifecycleOwner(this)

        return homeItemBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        upcoming_events.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        upcoming_events.adapter = EventAdapter(R.layout.event_list_item)

        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(upcoming_events)

        passed_events.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        passed_events.adapter = EventAdapter(R.layout.passed_event_list_item)

    }

}
