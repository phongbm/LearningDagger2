package com.phongbm.learningdagger2.view.task

import android.view.View
import androidx.navigation.fragment.findNavController
import com.phongbm.learningdagger2.R
import com.phongbm.learningdagger2.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_task_mgt.*

/**
 * Created by PhongBM on 03/17/2020
 */

class TaskMgtFragment : BaseFragment() {
    override fun getContentViewId() = R.layout.fragment_task_mgt

    override fun initializeViews() {
        btnTaskDetail.setOnClickListener(this)
    }

    override fun initializeComponents() {
    }

    override fun initializeData() {
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.btnTaskDetail -> findNavController().navigate(R.id.taskDetailFragment)
        }
    }

}