package com.phongbm.learningdagger2.architecture.domain.base

import com.phongbm.learningdagger2.architecture.data.base.BaseEntity
import java.util.*

/**
 * Created by PhongBM on 03/20/2020
 */

abstract class BaseModel(var id: String = UUID.randomUUID().toString()) {
    fun from(baseEntity: BaseEntity) {
        id = baseEntity.id
    }

}