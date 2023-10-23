package com.example.ejercicio_07

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import com.example.ejercicio_07.room.MascotaDB

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dbMascotas = Room.databaseBuilder(
            applicationContext,
            MascotaDB::class.java, "Mascota").build()
    }
}