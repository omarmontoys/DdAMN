package com.example.app_09

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        // Crear una lista de contactos ficticios
        val contactos = listOf(
            Contacto("Francisco Escobedo", "492-456-7890"),
            Contacto("Hector Roman", "492-654-3210"),
            Contacto("Jesus Guijarro", "492-555-1574"),
            Contacto("Ana Rebolloso", "492-888-3594"),
            Contacto("Francisco Escobedo", "492-456-7890"),
            Contacto("Hector Roman", "492-654-3210"),
            Contacto("Jesus Guijarro", "492-555-1574"),
            Contacto("Francisco Escobedo", "492-456-7890"),
            Contacto("Hector Roman", "492-654-3210"),
            Contacto("Jesus Guijarro", "492-555-1574"),
        )
        // Obtener una referencia al RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.listado)

        // Crear y configurar el adaptador
        val adapter = ContactoAdapterRecycler(contactos)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

}