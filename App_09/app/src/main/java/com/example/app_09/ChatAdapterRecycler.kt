package com.example.app_09

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ChatAdapterRecycler(private val mensajes: List<Mensajes>):RecyclerView.Adapter<ChatAdapterRecycler.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatAdapterRecycler.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.whatsapp_app_message, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val mensaje = mensajes[position]
        if (mensaje.usuario.isNotEmpty() && mensaje.mensaje.isNotEmpty() && mensaje.hora.isNotEmpty()) {
            holder.layoutUsuario1.visibility = View.VISIBLE
            holder.usuario1.text = mensaje.usuario
            holder.mensaje1.text = mensaje.mensaje
            holder.hora1.text = mensaje.hora
        } else {
            holder.layoutUsuario1.visibility = View.GONE
        }


        if (mensaje.usuario2.isNotEmpty() && mensaje.mensaje2.isNotEmpty() && mensaje.hora2.isNotEmpty()) {
            holder.layoutUsuario2.visibility = View.VISIBLE
            holder.usuario2.text = mensaje.usuario2
            holder.mensaje2.text = mensaje.mensaje2
            holder.hora2.text = mensaje.hora2
        } else {
            holder.layoutUsuario2.visibility = View.GONE
        }
    }


    override fun getItemCount(): Int {
        return mensajes.size
    }
    inner class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
        val usuario1: TextView = itemView.findViewById(R.id.Usuario1)
        val mensaje1: TextView = itemView.findViewById(R.id.mensaje1)
        val hora1: TextView = itemView.findViewById(R.id.hora)
        val layoutUsuario1: LinearLayout = itemView.findViewById(R.id.layoutUsuario1)
        val layoutUsuario2: LinearLayout = itemView.findViewById(R.id.layoutUsuario2)
        val usuario2: TextView = itemView.findViewById(R.id.Usuario2)
        val mensaje2: TextView = itemView.findViewById(R.id.mensaje2)
        val hora2: TextView = itemView.findViewById(R.id.hora2)
    }
}