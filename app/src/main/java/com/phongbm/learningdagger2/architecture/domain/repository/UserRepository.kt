package com.phongbm.learningdagger2.architecture.domain.repository

/**
 * Created by PhongBM on 03/20/2020
 */

interface UserRepository {
    suspend fun signIn(username: String, password: String): Boolean

}