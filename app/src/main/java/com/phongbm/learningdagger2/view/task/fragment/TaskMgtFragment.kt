package com.phongbm.learningdagger2.view.task.fragment

import android.content.Context
import android.util.Log
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.phongbm.learningdagger2.App
import com.phongbm.learningdagger2.R
import com.phongbm.learningdagger2.base.BaseFragment
import com.phongbm.learningdagger2.viewmodel.TaskMgtViewModel
import kotlinx.android.synthetic.main.fragment_task_mgt.*
import javax.inject.Inject

/**
 * Created by PhongBM on 03/17/2020
 */

class TaskMgtFragment : BaseFragment() {
    companion object {
        private const val TAG = "TaskMgtFragment"
    }

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel by viewModels<TaskMgtViewModel> { viewModelFactory }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        App.instance.taskMgtComponent = App.instance.appComponent.taskMgtComponent().create()
        App.instance.taskMgtComponent?.inject(this)
    }

    override fun getContentViewId() = R.layout.fragment_task_mgt

    override fun initializeViews() {
        btnGenerateNumber.setOnClickListener(this)
        btnTaskDetail.setOnClickListener(this)
    }

    override fun initializeComponents() {
        txtNumber.text = "Number: ${viewModel.number}"
    }

    override fun initializeData() {
        Log.d(TAG, "initializeData()... ${viewModel.hashCode()}")
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.btnGenerateNumber -> {
                viewModel.generateNumber()
                txtNumber.text = "Number: ${viewModel.number}"
            }

            R.id.btnTaskDetail -> findNavController().navigate(R.id.taskDetailFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        App.instance.taskMgtComponent = null
    }

}