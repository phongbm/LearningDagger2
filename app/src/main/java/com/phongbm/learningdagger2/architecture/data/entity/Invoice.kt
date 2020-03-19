package com.phongbm.learningdagger2.architecture.data.entity

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

/**
 * Created by PhongBM on 03/19/2020
 */

@Entity(tableName = "invoice",
        indices = [
            Index("id", unique = true)
        ])
data class Invoice(@PrimaryKey var id: String)