package com.phongbm.learningdagger2.view.fragment

import android.content.Context
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.phongbm.learningdagger2.App
import com.phongbm.learningdagger2.R
import com.phongbm.learningdagger2.base.BaseFragment
import com.phongbm.learningdagger2.viewmodel.LoginViewModel
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Created by PhongBM on 03/17/2020
 */

class LoginFragment : BaseFragment() {
    companion object {
        private const val TAG = "LoginFragment"
    }

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel by viewModels<LoginViewModel> { viewModelFactory }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        App.instance.appComponent.inject(this)
    }

    override fun getContentViewId() = R.layout.fragment_login

    override fun initializeViews() {
        btnSignIn.setOnClickListener(this)
    }

    override fun initializeComponents() {
    }

    override fun initializeData() {
        Log.d(TAG, "initializeData()... ${viewModel.hashCode()}")
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.btnSignIn -> doSignIn()
        }
    }

    // ---------------------------------------------------------------------------------------------
    private fun doSignIn() {
        launch {
            val username = edtUsername.text.toString()
            val password = edtPassword.text.toString()

            val result = viewModel.signIn(username, password)
            if (result) {
                Toast.makeText(context!!, "Successful", Toast.LENGTH_SHORT).show()

                val navOptions = NavOptions.Builder()
                        .setPopUpTo(R.id.loginFragment, true)
                        .build()
                findNavController().navigate(R.id.homeFragment, null, navOptions)
            } else {
                Toast.makeText(context!!, "Failed", Toast.LENGTH_SHORT).show()
            }
        }
    }

}