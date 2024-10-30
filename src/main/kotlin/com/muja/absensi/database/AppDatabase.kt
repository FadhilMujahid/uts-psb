package com.muja.absensi.database

import androidx.room.Database
import com.muja.absensi.model.ModelDatabase
import androidx.room.RoomDatabase
import com.muja.absensi.database.dao.DatabaseDao

@Database(entities = [ModelDatabase::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun databaseDao(): DatabaseDao?
}