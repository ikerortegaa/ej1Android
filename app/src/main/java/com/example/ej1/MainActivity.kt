package com.example.ej1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ej1.ui.theme.Ej1Theme

class   MainActivity : ComponentActivity() {

    lateinit var button: Button
    lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        button = findViewById(R.id.button)
        editText= findViewById(R.id.editTextText)


        button.setOnClickListener {
            val intent = Intent(this,Saludo::class.java)
            intent.putExtra("datos",editText.text.toString())
            startActivity(intent)
        }





    }
}

