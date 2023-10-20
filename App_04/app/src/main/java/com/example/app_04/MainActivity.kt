package com.example.app_04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnSecondActivity: Button
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSecondActivity = findViewById(R.id.btnSecondActivity)
        btnSecondActivity.setOnClickListener {
            val intentSecundario = Intent(this, Second_Activity::class.java)
            startActivity(intentSecundario)
        }
    }
}