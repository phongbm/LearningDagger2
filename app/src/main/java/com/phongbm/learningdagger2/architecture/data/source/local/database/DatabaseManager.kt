package com.phongbm.learningdagger2.architecture.data.source.local.database

import androidx.room.Room
import androidx.room.RoomDatabase
import com.phongbm.learningdagger2.App

/**
 * Created by PhongBM on 03/20/2020
 */

object DatabaseManager {
    private var accountDB: AccountDatabase? = null

    val accountDatabase: AccountDatabase
        get() {
            if (accountDB == null) {
                accountDB = Room.databaseBuilder(App.instance.applicationContext, AccountDatabase::class.java, "account_db")
                        .fallbackToDestructiveMigration()
                        .setJournalMode(RoomDatabase.JournalMode.TRUNCATE)
                        .build()
            }

            return accountDB!!
        }

}