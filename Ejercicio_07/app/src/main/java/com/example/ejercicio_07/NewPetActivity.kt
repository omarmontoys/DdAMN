package com.example.ejercicio_07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.room.Room
import com.example.ejercicio_07.room.Mascota
import com.example.ejercicio_07.room.MascotaDB
import com.example.ejercicio_07.R

class NewPetActivity : AppCompatActivity() {
    lateinit var btRegresar:Button
    lateinit var btGuardar: Button
    lateinit var etNombre: TextView
    lateinit var etRaza: Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_pet)

        btGuardar = findViewById(R.id.btnGuardar)
        btRegresar = findViewById(R.id.btnRegresar)
        etNombre = findViewById(R.id.etNombre)
        etRaza = findViewById(R.id.spRaza)
        btRegresar.setOnClickListener {
            val intentSecundario = Intent(this, MainActivity::class.java)
            startActivity(intentSecundario)
        }
        btGuardar.setOnClickListener {
            val intentSecundario = Intent(this, MainActivity::class.java)
            startActivity(intentSecundario)
        }
        agregarmascota()
    }
    private fun agregarmascota(){
        var nombreMascota = etNombre.text
        if(nombreMascota.isNotEmpty()){
            val dbMascota = Room.databaseBuilder(
                applicationContext,
                MascotaDB::class.java,
                "Mascotas").build()
            val mascotaDao = dbMascota.mascotaDao()
            mascotaDao.newMascota(Mascota(nombreMascota = nombreMascota.toString(), razaMascota = "schnauzer"))
        }
    }
}