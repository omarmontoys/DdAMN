package com.example.ejercicio_07.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface MascotaDao {
    @Query("SELECT * FROM  mascota")
    fun getAllMascotas() : List<Mascota>

    @Query("SELECT * FROM mascota WHERE id=:idMascota")
    fun getMascotaById(idMascota: Int)

    @Insert
    fun newMascota(mascota: Mascota)

    @Update
    fun updateMascota(mascota: Mascota)

    @Delete
    fun eliminarMascota(mascota: Mascota)

}