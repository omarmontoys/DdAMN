package com.example.practica03

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var B0: Button
    lateinit var B1: Button
    lateinit var B2: Button
    lateinit var B3: Button
    lateinit var B4: Button
    lateinit var B5: Button
    lateinit var B6: Button
    lateinit var B7: Button
    lateinit var B8: Button
    lateinit var B9: Button
    lateinit var BC: Button
    lateinit var BCE: Button
    lateinit var BDivision: Button
    lateinit var BSuma: Button
    lateinit var BResta: Button
    lateinit var BMultiplicacion: Button
    lateinit var BPunto: Button
    lateinit var BIgual: Button
    lateinit var TvSegundo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        B0= findViewById(R.id.button0)
        B1= findViewById(R.id.button1)
        B2= findViewById(R.id.button2)
        B3= findViewById(R.id.button3)
        B4= findViewById(R.id.button4)
        B5= findViewById(R.id.button5)
        B6= findViewById(R.id.button6)
        B7= findViewById(R.id.button7)
        B8= findViewById(R.id.button8)
        B9= findViewById(R.id.button9)
        BC= findViewById(R.id.buttonC)
        BPunto= findViewById(R.id.buttonPunto)
        BSuma= findViewById(R.id.buttonSuma)
        BDivision= findViewById(R.id.buttonDivision)
        BResta= findViewById(R.id.buttonResta)
        BMultiplicacion= findViewById(R.id.buttonMultiplicacion)
        BCE= findViewById(R.id.buttonCE)
        BIgual= findViewById(R.id.buttonIgual)

        TvSegundo = findViewById(R.id.tvSegundo)

        B0.setOnClickListener {
            val res = TvSegundo.text.toString()
            TvSegundo.text = res + B0.text.toString()
        }
        B1.setOnClickListener {
            val res = TvSegundo.text.toString()
            TvSegundo.text = res + B1.text.toString()
        }
        B2.setOnClickListener {
            val res = TvSegundo.text.toString()
            TvSegundo.text = res + B2.text.toString()
        }
        B3.setOnClickListener {
            val res = TvSegundo.text.toString()
            TvSegundo.text = res + B3.text.toString()
        }
        B4.setOnClickListener {
            val res = TvSegundo.text.toString()
            TvSegundo.text = res + B4.text.toString()
        }
        B5.setOnClickListener {
            val res = TvSegundo.text.toString()
            TvSegundo.text = res + B5.text.toString()
        }
        B6.setOnClickListener {
            val res = TvSegundo.text.toString()
            TvSegundo.text = res + B6.text.toString()
        }
        B7.setOnClickListener {
            val res = TvSegundo.text.toString()
            TvSegundo.text = res + B7.text.toString()
        }
        B8.setOnClickListener {
            val res = TvSegundo.text.toString()
            TvSegundo.text = res + B8.text.toString()
        }
        B9.setOnClickListener {
            val res = TvSegundo.text.toString()
            TvSegundo.text = res + B9.text.toString()
        }
        BC.setOnClickListener {
            TvSegundo.text = ""
        }
        BPunto.setOnClickListener {
            val res = TvSegundo.text.toString()
            if (!res.contains(".")) {
                TvSegundo.text = res + BPunto.text.toString()
            }
        }
        BSuma.setOnClickListener {
            val res = TvSegundo.text.toString()
            val last = res.lastOrNull()
            if (last != '-' && last != '+' && last != '*' && last != '/'&& last != '%') {
                TvSegundo.text = res + BSuma.text.toString()
            }
        }
        BDivision.setOnClickListener {
            val res = TvSegundo.text.toString()
            val last = res.lastOrNull()
            if (last != '-' && last != '+' && last != '*' && last != '/'&& last != '%') {
                TvSegundo.text = res + BDivision.text.toString()
            }
        }
        BResta.setOnClickListener {
            val res = TvSegundo.text.toString()
            val last = res.lastOrNull()
            if (last != '-' && last != '+' && last != '*' && last != '/'&& last != '%') {
                TvSegundo.text = res + BResta.text.toString()
            }
        }
        BMultiplicacion.setOnClickListener {
            val res = TvSegundo.text.toString()
            val last = res.lastOrNull()
            if (last != '-' && last != '+' && last != '*' && last != '/'&& last != '%') {
                TvSegundo.text = res + BMultiplicacion.text.toString()
            }
        }
        BCE.setOnClickListener {
            val res = TvSegundo.text.toString()

            if (res.isNotEmpty()) {
                TvSegundo.text = res.substring(0, res.length - 1)
            }
        }
        BIgual.setOnClickListener {
            val expresion = TvSegundo.text.toString()
            try {
                val resultado = evaluarExpresion(expresion)
                TvSegundo.text = resultado.toString()
            } catch (e: ArithmeticException) {
                TvSegundo.text = "Error: ${e.message}"
            } catch (e: Exception) {
                TvSegundo.text = "Error"
            }
        }

    }
    // Función para evaluar una expresión matemática dada
    fun evaluarExpresion(expresion: String): Double {
        val operadores = mutableListOf<Char>() // Lista de operadores
        val numeros = mutableListOf<Double>()  // Lista de números

        var numTemporal = ""  // Variable temporal para construir números
        for (caracter in expresion) { // Iterar sobre cada caracter de la expresión
            if (caracter.isDigit() || caracter == '.') { // Si el caracter es dígito o punto decimal
                numTemporal += caracter  // Construir el número temporal
            } else { // Si el caracter es un operador
                if (numTemporal.isNotEmpty()) {
                    numeros.add(numTemporal.toDouble()) // Agregar el número construido a la lista de números
                    numTemporal = ""  // Reiniciar el número temporal
                }

                // Resolver operaciones con prioridad mayor o igual
                while (operadores.isNotEmpty() && prioridadOperador(operadores.last()) >= prioridadOperador(caracter)) {
                    val operador = operadores.removeAt(operadores.size - 1)
                    val num2 = numeros.removeAt(numeros.size - 1)
                    val num1 = numeros.removeAt(numeros.size - 1)
                    numeros.add(aplicarOperacion(operador, num1, num2))
                }
                operadores.add(caracter) // Agregar operador a la lista de operadores
            }
        }
        if (numTemporal.isNotEmpty()) {
            numeros.add(numTemporal.toDouble()) // Agregar el último número construido
        }
        // Resolver cualquier operación restante
        while (operadores.isNotEmpty()) {
            val operador = operadores.removeAt(operadores.size - 1)
            val num2 = numeros.removeAt(numeros.size - 1)
            val num1 = numeros.removeAt(numeros.size - 1)
            numeros.add(aplicarOperacion(operador, num1, num2))
        }

        return numeros[0] // Devolver el resultado final
    }

    // Función para aplicar una operación a dos números
    fun aplicarOperacion(operador: Char, num1: Double, num2: Double): Double {
        if (operador == '/' && num2 == 0.0) {
            throw ArithmeticException("No se puede dividir entre 0")
        }
        return when (operador) { // Determinar el tipo de operación
            '+' -> num1 + num2
            '-' -> num1 - num2
            '*' -> num1 * num2
            '/' -> num1 / num2
            else -> throw IllegalArgumentException("Operador no válido") // Lanzar error si el operador es inválido
        }
    }


    // Función para determinar la prioridad de un operador
    fun prioridadOperador(operador: Char): Int {
        return when (operador) { // Asignar prioridades a los operadores
            '+', '-' -> 1
            '*', '/' -> 2
            else -> 0
        }
    }


}