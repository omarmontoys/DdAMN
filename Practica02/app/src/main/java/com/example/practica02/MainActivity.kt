package com.example.practica02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var BtnVotar: Button
    lateinit var BtnSalir: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BtnVotar =findViewById(R.id.buttonVotar)
        BtnSalir = findViewById(R.id.buttonSalir)

        BtnVotar.setOnClickListener {
            Votar()
        }
        BtnSalir.setOnClickListener {
            MensajeSalir()
        }
    }
    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
    }
    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show()
    }
    override fun onPause() {
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show()
        super.onPause()
    }
    override fun onStop() {
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show()
        super.onStop()
    }
    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show()
    }
    override fun onDestroy() {
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show()
        super.onDestroy()
    }
    fun Votar() {
        val builder = AlertDialog.Builder(this)

        // Inflar el diseño personalizado
        builder.setTitle("Votaciones!")
        val customLayout = layoutInflater.inflate(R.layout.votacion_layout, null)
        builder.setView(customLayout)

        val botonVotar1 = customLayout.findViewById<Button>(R.id.botonVotar1)
        botonVotar1.setOnClickListener {
            // Lógica para cuando se presiona el botón de votar
            // Aquí puedes realizar la acción de voto
            finish()
        }

        val botonVotar2 = customLayout.findViewById<Button>(R.id.botonVotar2)
        botonVotar2.setOnClickListener {
            // Lógica para cuando se presiona el botón de votar
            // Aquí puedes realizar la acción de voto
            finish()
        }

        val botonVotar3 = customLayout.findViewById<Button>(R.id.botonVotar3)
        botonVotar3.setOnClickListener {
            // Lógica para cuando se presiona el botón de votar
            // Aquí puedes realizar la acción de voto
            finish()
        }

        builder.setNegativeButton("Cancelar") {
                dialog, which -> dialog.cancel()
        }

        builder.setCancelable(false)

        val alertDialog = builder.create()
        alertDialog.show()
    }
    fun MensajeSalir() {
        // Create tel objeto de cuadro de dialogo
        val builder = AlertDialog.Builder(this)
        // Mensaje dentro del cuadro
        builder.setMessage("Desea salir de la aplicacion")
        // Titulo
        builder.setTitle("Salir!")
        // Funciona por si el usuario quiere dar click fuera del cuadro de dialogo
        builder.setCancelable(false)
        // Si el usuario da clic en salir
        builder.setPositiveButton("Salir") {
                dialog, which -> finish()
        }
        // Si el usuario da clic en permanecer
        builder.setNegativeButton("Permanecer") {
                dialog, which -> dialog.cancel()
        }
        // Crea el cuadro de dialogo
        val alertDialog = builder.create()
        // Lo muestra al usuario
        alertDialog.show()
        }
}