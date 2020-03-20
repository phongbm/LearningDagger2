package com.phongbm.learningdagger2.viewmodel

import com.phongbm.learningdagger2.architecture.domain.repository.UserRepository
import com.phongbm.learningdagger2.base.BaseViewModel
import javax.inject.Inject

/**
 * Created by PhongBM on 03/17/2020
 */

class LoginViewModel
@Inject
constructor(private val userRepository: UserRepository) : BaseViewModel() {
    suspend fun signIn(username: String, password: String) = userRepository.signIn(username, password)

}