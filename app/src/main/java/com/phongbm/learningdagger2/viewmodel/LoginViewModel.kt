package com.phongbm.learningdagger2.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.phongbm.learningdagger2.repository.UserRepository
import javax.inject.Inject

/**
 * Created by PhongBM on 03/17/2020
 */

class LoginViewModel
@Inject
constructor(private val userRepository: UserRepository) : ViewModel() {
    init {
        Log.d(javaClass.name, "${javaClass.simpleName} was instantiated.")
    }

    override fun onCleared() {
        Log.d(javaClass.name, "${javaClass.simpleName} onCleared()...")
    }

    suspend fun signIn(username: String, password: String) = userRepository.signIn(username, password)

}