package com.example.vladyslavromanikdemo.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.vladyslavromanikdemo.data.db.dao.ProductsDao
import com.example.vladyslavromanikdemo.data.db.model.ProductDataBaseModel

@Database(
    entities = [ProductDataBaseModel::class],
    version = 1,
    exportSchema = false
)
abstract class TurkcellDataBase : RoomDatabase() {

    abstract val productDao: ProductsDao
}
