package com.example.ejercicio_07.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Mascota(
    @PrimaryKey(autoGenerate = true) val id:Int=0,
    @ColumnInfo(name = "nombre") val nombreMascota: String?,
    @ColumnInfo(name = "raza") val razaMascota: String?
)
