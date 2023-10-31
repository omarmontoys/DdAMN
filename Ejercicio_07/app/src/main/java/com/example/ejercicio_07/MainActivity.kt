package com.example.ejercicio_07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room

import com.example.ejercicio_07.room.Mascota
import com.example.ejercicio_07.room.MascotaDB
import com.example.ejercicio_07.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    lateinit var BtnAgregar:Button
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        BtnAgregar= findViewById(R.id.btnAgregar)
        val dbMascotas = Room.databaseBuilder(
            applicationContext,
            MascotaDB::class.java, "Mascota").build()
        //Usamos el DAO
        val mascotaDao = dbMascotas.mascotaDao()
        //Para evitar bloquear la ui de la aplicacion
        CoroutineScope(Dispatchers.IO).launch {
            //Agregamos una nueva mascota
            //mascotaDao.newMascota(Mascota(nombreMascota = "Elmer", razaMascota = "schnauzer"))
            //Listar las mascotas
            val recyclerView = findViewById<RecyclerView>(R.id.recyclerMascotas)
            // Obtener una referencia al RecyclerView
            val listadoMascotas : List<Mascota> = mascotaDao.getAllMascotas()
            // Crear y configurar el adaptador
            val adapter = MascotaAdapter(listadoMascotas)
            recyclerView.adapter = adapter
            recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
            //for(mascota in listadoMascotas){
            //    Log.d("Mascota: ${mascota.nombreMascota}","")
            //}
        }

        //ObtenerMascotas(dbMascota)
        BtnAgregar.setOnClickListener {
            val intentSecundario = Intent(this, NewPetActivity::class.java)
            startActivity(intentSecundario)
        }


    }
}