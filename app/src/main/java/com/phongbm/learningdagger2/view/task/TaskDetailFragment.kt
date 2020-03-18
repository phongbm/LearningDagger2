package com.phongbm.learningdagger2.view.task

import android.content.Context
import android.util.Log
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.phongbm.learningdagger2.App
import com.phongbm.learningdagger2.R
import com.phongbm.learningdagger2.base.BaseFragment
import com.phongbm.learningdagger2.viewmodel.TaskMgtViewModel
import kotlinx.android.synthetic.main.fragment_task_mgt.*
import javax.inject.Inject

/**
 * Created by PhongBM on 03/18/2020
 */

class TaskDetailFragment : BaseFragment() {
    companion object {
        private const val TAG = "TaskDetailFragment"
    }

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel by viewModels<TaskMgtViewModel> { viewModelFactory }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        App.instance.taskMgtComponent?.inject(this)
    }

    override fun getContentViewId() = R.layout.fragment_task_detail

    override fun initializeViews() {
    }

    override fun initializeComponents() {
        txtNumber.text = "Number: ${viewModel.number}"
    }

    override fun initializeData() {
        Log.d(TAG, "initializeData()... ${viewModel.hashCode()}")
    }

}