package com.example.ej1

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

class Saludo : ComponentActivity(){

    lateinit var saludo: TextView
    lateinit var nombre: String
    lateinit var fecha: String
    lateinit var mostrarFecha: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.saludo)


        mostrarFecha = findViewById(R.id.mostrarFecha)
        saludo = findViewById(R.id.mostrarNombre)
        nombre = intent.extras?.getString("datos").orEmpty()
        fecha = intent.extras?.getString("fecha").orEmpty()

        saludo.text = "Hola $nombre"
        mostrarFecha.text = "La fecha de hoy es: $fecha"


    }

}