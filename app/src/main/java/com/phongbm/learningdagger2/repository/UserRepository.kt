package com.phongbm.learningdagger2.repository

import com.phongbm.learningdagger2.data.UserDataSource
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by PhongBM on 03/17/2020
 */

@Singleton
class UserRepository
@Inject
constructor(private val userDataSource: UserDataSource) {
    suspend fun signIn(username: String, password: String) = userDataSource.signIn(username, password)

}