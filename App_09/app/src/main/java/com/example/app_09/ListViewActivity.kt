package com.example.app_09

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val listView: ListView = findViewById(R.id.listadoLV)
        val contactos = obtenerListaDeContactos()

        val adapter = ContactoAdapterListView(contactos)
        listView.adapter = adapter
    }
    private fun obtenerListaDeContactos(): List<Contacto> {
        return listOf(
            Contacto("Francisco Escobedo", "492-456-7890"),
            Contacto("Hector Roman", "492-654-3210"),
            Contacto("Jesus Guijarro", "492-555-1574"),
            )
    }
}