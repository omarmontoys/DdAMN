package com.example.app_04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Second_Activity : AppCompatActivity() {
    lateinit var btnThirdActivity:Button
    lateinit var btnFirtsActivity:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        btnThirdActivity = findViewById(R.id.btnThirdActivity)
        btnFirtsActivity = findViewById(R.id.btnFirstActivity)

        btnFirtsActivity.setOnClickListener {
            val intentSecundario = Intent(this, MainActivity::class.java)
            startActivity(intentSecundario)
        }
        btnThirdActivity.setOnClickListener {
            val intentSecundario = Intent(this, Third_Activity::class.java)
            startActivity(intentSecundario)
        }
    }
}