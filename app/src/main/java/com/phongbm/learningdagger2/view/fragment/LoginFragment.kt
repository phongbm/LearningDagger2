package com.phongbm.learningdagger2.view.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.phongbm.learningdagger2.App
import com.phongbm.learningdagger2.R
import com.phongbm.learningdagger2.extension.inflate
import com.phongbm.learningdagger2.viewmodel.LoginViewModel
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext

/**
 * Created by PhongBM on 03/17/2020
 */

class LoginFragment : Fragment(), CoroutineScope, View.OnClickListener {
    companion object {
        private const val TAG = "LoginFragment"
    }

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main

    @Inject
    lateinit var loginViewModel: LoginViewModel

    override fun onAttach(context: Context) {
        Log.d(TAG, "onAttach()...")

        App.instance.appComponent.inject(this)

        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate()...")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d(TAG, "onCreateView()...")
        return container.inflate(inflater, R.layout.fragment_login)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d(TAG, "onViewCreated()...")

        btnSignIn.setOnClickListener(this)
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

            val result = loginViewModel.signIn(username, password)
            if (result) {
                Toast.makeText(context!!, "Successful", Toast.LENGTH_SHORT).show()

                findNavController().navigate(R.id.salesInvoiceFragment, null, null)
            } else {
                Toast.makeText(context!!, "Failed", Toast.LENGTH_SHORT).show()
            }
        }
    }

}