package com.example.app_02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //Hacer la declaracion (2 editText-2 Numeros, 1 TextView-Resultado, 4 Buttons-Operaciones)
    lateinit var num1:EditText
    lateinit var num2:EditText
    lateinit var resultado:TextView
    lateinit var btnSuma:Button
    lateinit var btnResta:Button
    lateinit var btnMultiplicacion:Button
    lateinit var btnDivision:Button
    lateinit var btnLimpiar:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Aqui se especifica el diseño que carga
        //la Activity - Pantalla
        setContentView(R.layout.activity_main3)
        //Hacer referencia a la vista
        num1 = findViewById(R.id.etNumero1)
        num2 = findViewById(R.id.etNumero2)
        resultado = findViewById(R.id.tvResultado)
        btnSuma = findViewById(R.id.btnSuma)
        btnDivision = findViewById(R.id.btnDivision)
        btnMultiplicacion = findViewById(R.id.btnMultiplicacion)
        btnResta = findViewById(R.id.btnResta)
        btnLimpiar = findViewById(R.id.btnLimpiar)


        btnSuma.setOnClickListener {
            //Mandar llamar el metodo
            realizarSuma()
        }
        btnResta.setOnClickListener {
            realizarResta()
        }
        btnDivision.setOnClickListener {
            realizarDivision()
        }
        btnMultiplicacion.setOnClickListener {
            realizarMultiplicacion()
        }
        btnLimpiar.setOnClickListener {
            Limpiar()
        }




    }
    //Procedimiento
    fun realizarSuma(){
        // 1.-   Obtener valores de cajas de texto
        val num1Text:String = num1.text.toString()
        val num2Text:String = num2.text.toString()
        // 2.-   Determinar si no estan vacias las cajas de texto
        if (num1Text.isNotEmpty() && num2Text.isNotEmpty())
        {
            // 3.-   Asignar valores con numeros
            var num1count:Double = num1Text.toDouble()
            var num2count:Double = num2Text.toDouble()
            // 4.-   Realizar la operacion
            var res1 = num1count + num2count
            // 5.-   Nostrar el resultado
            resultado.setText(res1.toString())
        }
        //  2.1.-En caso de estar vacios mostrar un mensaje apropiado
        else
        {
            resultado.text= "Error de datos"
        }



    }
    fun realizarResta(){
        // 1.-   Obtener valores de cajas de texto
        val num1Text:String = num1.text.toString()
        val num2Text:String = num2.text.toString()
        // 2.-   Determinar si no estan vacias las cajas de texto
        if (num1Text.isNotEmpty() && num2Text.isNotEmpty())
        {
            // 3.-   Asignar valores con numeros
            var num1count:Double = num1Text.toDouble()
            var num2count:Double = num2Text.toDouble()
            // 4.-   Realizar la operacion
            var res1:Double = num1count - num2count
            // 5.-   Nostrar el resultado
            resultado.setText(res1.toString())
        }
        //  2.1.-En caso de estar vacios mostrar un mensaje apropiado
        else
        {
            resultado.text= "Error de datos"
        }

    }
    fun realizarDivision(){
        // 1.-   Obtener valores de cajas de texto
        val num1Text:String = num1.text.toString()
        val num2Text:String = num2.text.toString()
        // 2.-   Determinar si no estan vacias las cajas de texto
        if (num1Text.isNotEmpty() && num2Text.isNotEmpty())
            {
            if (num2Text.contentEquals("0")){
                resultado.text= "No se divide entre 0"
            }else{
                // 3.-   Asignar valores con numeros
                var num1count:Double = num1Text.toDouble()
                var num2count:Double = num2Text.toDouble()
                // 4.-   Realizar la operacion
                var res1:Double = num1count / num2count
                // 5.-   Nostrar el resultado
                resultado.setText(res1.toString())
            }

            }
        //  2.1.-En caso de estar vacios mostrar un mensaje apropiado
        else
        {
            resultado.text= "Error de datos"
        }

    }
    fun realizarMultiplicacion(){
        // 1.-   Obtener valores de cajas de texto
        val num1Text:String = num1.text.toString()
        val num2Text:String = num2.text.toString()
        // 2.-   Determinar si no estan vacias las cajas de texto
        if (num1Text.isNotEmpty() && num2Text.isNotEmpty())
        {
            // 3.-   Asignar valores con numeros
            var num1count:Double = num1Text.toDouble()
            var num2count:Double = num2Text.toDouble()
            // 4.-   Realizar la operacion
            var res1:Double = num1count * num2count
            // 5.-   Nostrar el resultado
            resultado.setText(res1.toString())
        }
        //  2.1.-En caso de estar vacios mostrar un mensaje apropiado
        else
        {
            resultado.text= "Error de datos"
        }

    }
    fun Limpiar(){

        num1.text.clear()
        num2.text.clear()
        resultado.text = "0.0"

    }
}