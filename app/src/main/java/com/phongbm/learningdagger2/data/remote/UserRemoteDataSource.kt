package com.phongbm.learningdagger2.data.remote

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 * Created by PhongBM on 03/17/2020
 */

object UserRemoteDataSource {
    suspend fun signIn(username: String, password: String) = withContext(Dispatchers.IO) {
        username == "phongbm" && password == "123456"
    }

}