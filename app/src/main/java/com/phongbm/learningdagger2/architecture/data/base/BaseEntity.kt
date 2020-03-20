package com.phongbm.learningdagger2.architecture.data.base

import androidx.room.PrimaryKey
import com.phongbm.learningdagger2.architecture.domain.base.BaseDTO
import java.util.*

/**
 * Created by PhongBM on 03/19/2020
 */

abstract class BaseEntity(@PrimaryKey var id: String = UUID.randomUUID().toString()) {
    fun from(baseDTO: BaseDTO) {
        id = baseDTO.id
    }

}