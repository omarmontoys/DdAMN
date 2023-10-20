package com.example.app_03

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    //Declaracion
    lateinit var tvUsuario:TextView
    lateinit var btnSalir:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Referencia
        tvUsuario = findViewById(R.id.tvUsuario)
        btnSalir = findViewById(R.id.btnRegresar)
        //Obtener los parametros extras
        val usuario = intent.getStringExtra("usuario")
        val textoExtra = "¡Bienvenido de nuevo, "
        val mensajeCompleto = "$textoExtra$usuario!"
        tvUsuario.text = mensajeCompleto
        btnSalir.setOnClickListener {
            val intentSecundario = Intent(this, Login::class.java)
            startActivity(intentSecundario)
        }
    }
}
