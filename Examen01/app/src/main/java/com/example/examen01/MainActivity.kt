package com.example.examen01

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.os.Handler
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView
    lateinit var imagenView: ImageView
    lateinit var imageButton:ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.txAlert)
        imagenView = findViewById(R.id.RedAlert)
        imageButton = findViewById(R.id.Notification)

        imageButton.setOnClickListener {
            textView.visibility = View.INVISIBLE
            imagenView.visibility = View.INVISIBLE
            Handler().postDelayed({
                // Hacer que vuelvan a aparecer
                textView.visibility = View.VISIBLE
                imagenView.visibility = View.VISIBLE
            }, 2000) // 2000 milisegundos = 2 segundos

        }



    }
}
