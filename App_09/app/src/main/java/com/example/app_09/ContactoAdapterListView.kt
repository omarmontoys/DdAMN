package com.example.app_09

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ContactoAdapterListView(private val contactos: List<Contacto>) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: LayoutInflater.from(parent?.context).inflate(R.layout.whatsapp_listview, parent, false)

        val nombreContacto: TextView = view.findViewById(R.id.nombreContacto)
        val telefonoContacto: TextView = view.findViewById(R.id.telefonoContacto)

        val contacto = contactos[position]
        nombreContacto.text = contacto.nombre
        telefonoContacto.text = contacto.telefono

        return view
    }

    override fun getItem(position: Int): Any {
        return contactos[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return contactos.size
    }
}
