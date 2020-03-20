package com.phongbm.learningdagger2.architecture.data.source.local.database

import androidx.room.TypeConverter
import java.math.BigDecimal

/**
 * Created by PhongBM on 03/20/2020
 */

class BigDecimalConverter() {
    @TypeConverter
    fun convert2String(value: BigDecimal) = value.toString()

    @TypeConverter
    fun convert2BigDecimal(value: String) = BigDecimal(value)
}