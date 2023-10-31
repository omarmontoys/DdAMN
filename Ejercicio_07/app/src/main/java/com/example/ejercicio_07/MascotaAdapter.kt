package com.example.ejercicio_07

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ejercicio_07.room.Mascota

class MascotaAdapter(private val listadoMascota:List<Mascota>):RecyclerView.Adapter<MascotaAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MascotaAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_mascota, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: MascotaAdapter.ViewHolder, position: Int) {
        //Para mostrar el contenido de cada posicion del listado
        val mascota = listadoMascota[position]
            holder.nombreMascota.text = mascota.nombreMascota
            holder.raza1.text = mascota.razaMascota
        //Log.d("En Adaptador Mascota: ${mascota.nombreMascota}","")
    }

    override fun getItemCount(): Int {
        return listadoMascota.size
    }

    inner class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
        val nombreMascota: TextView = itemView.findViewById(R.id.NombreMascota)
        val raza1: TextView = itemView.findViewById(R.id.RazaMascota)

    }

}