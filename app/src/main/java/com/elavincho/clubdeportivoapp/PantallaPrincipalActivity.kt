package com.elavincho.clubdeportivoapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PantallaPrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pantalla_principal)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        /*Botón Salir*/

        val btnSalir = findViewById<View>(R.id.btnSalir)

        btnSalir.setOnClickListener {
            val intentSalir = Intent(this, MainActivity::class.java)
            /* Por ultimo hay que llamar al método startActivity() y pasarle el intent*/
            startActivity(intentSalir)
        }


    }
}