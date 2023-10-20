package com.example.app_09

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var BtnListView: Button
    private lateinit var BtnRecycler: Button
    private lateinit var BtnWhatsapp: Button
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        BtnListView= findViewById(R.id.btnListView)
        BtnRecycler= findViewById(R.id.btnRecyclerView)
        BtnWhatsapp= findViewById(R.id.btnWhastsApp)


        BtnListView.setOnClickListener {
            val intentSecundario = Intent(this, ListViewActivity::class.java)
            startActivity(intentSecundario)
        }

        BtnRecycler.setOnClickListener {
            val intentSecundario = Intent(this, RecyclerViewActivity::class.java)
            startActivity(intentSecundario)
        }
        BtnWhatsapp.setOnClickListener {
            val intentSecundario = Intent(this, WhatsAppActivity::class.java)
            startActivity(intentSecundario)
        }


    }
}