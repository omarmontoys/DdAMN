package com.example.ejercicio_07.room


import androidx.room.Database
import androidx.room.RoomDatabase
@Database(entities = [Mascota::class], version = 1)
abstract class MascotaDB : RoomDatabase() {
    abstract fun mascotaDao(): MascotaDao

}