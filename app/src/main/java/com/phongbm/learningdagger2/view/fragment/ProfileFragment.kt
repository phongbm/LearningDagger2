package com.phongbm.learningdagger2.view.fragment

import android.content.Context
import android.util.Log
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.phongbm.learningdagger2.App
import com.phongbm.learningdagger2.R
import com.phongbm.learningdagger2.base.BaseFragment
import com.phongbm.learningdagger2.viewmodel.ProfileViewModel
import kotlinx.android.synthetic.main.fragment_profile.*
import javax.inject.Inject

/**
 * Created by PhongBM on 03/18/2020
 */

class ProfileFragment : BaseFragment() {
    companion object {
        private const val TAG = "ProfileFragment"
    }

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel by viewModels<ProfileViewModel> { viewModelFactory }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        App.instance.appComponent.inject(this)
    }

    override fun getContentViewId() = R.layout.fragment_profile

    override fun initializeViews() {
        btnProfileEdit.setOnClickListener(this)
    }

    override fun initializeComponents() {
    }

    override fun initializeData() {
        Log.d(TAG, "initializeData()... ${viewModel.hashCode()}")
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.btnProfileEdit -> findNavController().navigate(R.id.profileEditFragment)
        }
    }

}