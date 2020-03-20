package com.phongbm.learningdagger2.architecture.data.base

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update

/**
 * Created by PhongBM on 03/19/2020
 */

interface BaseDao<in E> {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun save(entity: E)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun save(entities: List<E>)

    @Update
    fun update(entity: E)

    @Delete
    fun delete(entity: E)

}