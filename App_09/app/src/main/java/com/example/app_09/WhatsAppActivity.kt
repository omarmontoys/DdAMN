package com.example.app_09

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class WhatsAppActivity : AppCompatActivity() {
    lateinit var btnEnviar:Button
    lateinit var tvMensaje:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_whats_app)
        btnEnviar = findViewById(R.id.btnEnviar)
        tvMensaje = findViewById(R.id.tvMensajes)
        // Crear una lista de contactos ficticios
        val mensajes = listOf(
            Mensajes("Francisco Escobedo", "492-456-7890", "12:00", "Francisco Escobedo", "492-456-7890", "12:00"),
            Mensajes("", "", "", "Francisco Escobedo", "492-456-7890", "12:00"),
            Mensajes("Francisco Escobedo", "492-456-7890", "12:00", "", "", ""),
            Mensajes("Francisco Escobedo", "492-456-7890", "12:00", "", "", ""),
            Mensajes("Francisco Escobedo", "492-456-7890", "12:00", "Francisco Escobedo", "492-456-7890", "12:00"),
            Mensajes("Francisco Escobedo", "492-456-7890", "12:00", "Francisco Escobedo", "492-456-7890", "12:00"),
            Mensajes("Francisco Escobedo", "492-456-7890", "12:00", "Francisco Escobedo", "492-456-7890", "12:00"),
            )
        // Obtener una referencia al RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerWhatsApp)

        // Crear y configurar el adaptador
        val adapter = ChatAdapterRecycler(mensajes)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
        btnEnviar.setOnClickListener {
            tvMensaje.text = ""
        }
    }
}