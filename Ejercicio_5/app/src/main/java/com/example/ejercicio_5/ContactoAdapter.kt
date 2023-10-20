package com.example.ejercicio_5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactoAdapter(private val contactos: List<Contacto>):RecyclerView.Adapter<ContactoAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactoAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_contacto, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contacto = contactos[position]
        holder.nombreContacto.text = contacto.nombre
        holder.telefonoContacto.text = contacto.telefono
    }

    override fun getItemCount(): Int {
        return contactos.size
    }
    inner class ViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
        val nombreContacto: TextView = itemView.findViewById(R.id.nombreContacto)
        val telefonoContacto: TextView = itemView.findViewById(R.id.telefonoContacto)
    }
}