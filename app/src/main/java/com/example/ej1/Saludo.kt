package com.example.ej1

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

class Saludo : ComponentActivity(){

    lateinit var saludo: TextView
    lateinit var nombre: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.saludo)


        saludo = findViewById(R.id.mostrarNombre)
        nombre = intent.extras?.getString("datos").orEmpty()

        saludo.text = "Hola $nombre"


    }

}