package com.example.ej1

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity


class   MainActivity : ComponentActivity() {

    lateinit var button: Button
    lateinit var editText: EditText
    lateinit var DatePicker: DatePicker
    lateinit var recogeFecha: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        button = findViewById(R.id.button)
        editText= findViewById(R.id.editTextText)
        DatePicker= findViewById(R.id.fecha)


        button.setOnClickListener {
            alerta()
           /* val intent = Intent(this,Saludo::class.java)
            intent.putExtra("datos",editText.text.toString())
            startActivity(intent)*/
        }

    }
    fun alerta(){
        val builder = AlertDialog.Builder(this);
        builder.setTitle("Primer AlertDialog")
        builder.setMessage("Primer ejemplo de un alertDialog en android")
         builder.setPositiveButton(android.R.string.ok){ dialog, which ->
             Toast.makeText(applicationContext, android.R.string.ok, Toast.LENGTH_SHORT).show()
             val intent = Intent(this,Saludo::class.java)
             intent.putExtra("datos",editText.text.toString())
             intent.putExtra("fecha",fecha())
             startActivity(intent)
         }

        //Añado los alerts Dialog y los Toast

        builder.setNegativeButton(android.R.string.cancel){ dialog, which ->
            Toast.makeText(applicationContext, android.R.string.cancel, Toast.LENGTH_SHORT).show()}

        builder.setNeutralButton("omitir"){ dialog, which ->
            Toast.makeText(applicationContext, "omitir", Toast.LENGTH_SHORT).show()}
        builder.show()

    }

    fun fecha():String{

        return DatePicker.dayOfMonth.toString() +"-"+ DatePicker.month.toString() +"-"+ DatePicker.year.toString()


    }

}

