package com.phongbm.learningdagger2.data

import com.phongbm.learningdagger2.data.remote.UserRemoteDataSource
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by PhongBM on 03/17/2020
 */

@Singleton
class UserDataSource
@Inject
constructor(private val userRemoteDataSource: UserRemoteDataSource) {
    suspend fun signIn(username: String, password: String) = userRemoteDataSource.signIn(username, password)

}