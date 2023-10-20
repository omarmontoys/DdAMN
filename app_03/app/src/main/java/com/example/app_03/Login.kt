package com.example.app_03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class Login : AppCompatActivity() {
    //Variables
    lateinit var etUser: EditText
    lateinit var etPassword:EditText
    lateinit var btnLogin:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //Referencias
        etUser = findViewById(R.id.etUsuario)
        etPassword = findViewById(R.id.etPassword)
        btnLogin =findViewById(R.id.btnIngresar)


        //Acciones
        btnLogin.setOnClickListener {
            //Mandamos llamar a la funcion que valida e ingresa
            ingresarApp()
        }

    }
    fun ingresarApp(){
        //1.- Obterner los datos de ingreso
        val usuario:String = etUser.text.toString()
        val contraseña:String = etPassword.text.toString()
        //2.- Validar ususario y contraseña iguales
        if(usuario.isNotEmpty() && contraseña.isNotEmpty()){
            //Paso la validacion de vacio
            if (usuario == contraseña){
                //Paso la validacion del usuario
                //Iniciar el Intent
                val intentPrincipal = Intent(this, MainActivity::class.java)
                //pasar parametros a la otra actividad
                intentPrincipal.putExtra("usuario",usuario)
                startActivity(intentPrincipal)

            }else{
                Toast.makeText(this, "Usuario y clave incorrectos", Toast.LENGTH_LONG).show()
            }
        }else{
            Toast.makeText(this, "Rellena los campos", Toast.LENGTH_LONG).show()
        }
        //2.1 .- Si no son iguales mostrar mensaje de error
        //3.- Iniciar un intent para mandar a otra actividad
        //4.- Pasar parametros extras: Usuario
        //5.- Iniciar la actividad
    }

}