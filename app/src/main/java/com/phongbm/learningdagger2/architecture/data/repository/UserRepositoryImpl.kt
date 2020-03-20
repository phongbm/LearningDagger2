package com.phongbm.learningdagger2.architecture.data.repository

import com.phongbm.learningdagger2.architecture.domain.repository.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by PhongBM on 03/20/2020
 */

@Singleton
class UserRepositoryImpl
@Inject
constructor() : UserRepository {
    override suspend fun signIn(username: String, password: String) = withContext(Dispatchers.IO) {
        username == "phongbm" && password == "123456"
    }

}