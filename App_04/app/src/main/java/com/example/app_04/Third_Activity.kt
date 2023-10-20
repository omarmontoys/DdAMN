package com.example.app_04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Third_Activity : AppCompatActivity() {
    lateinit var btnSecond_Activity:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        btnSecond_Activity = findViewById(R.id.btnSecondActivityy)
        btnSecond_Activity.setOnClickListener {
            val intentSecundario = Intent(this, Second_Activity::class.java)
            startActivity(intentSecundario)
        }
    }
}