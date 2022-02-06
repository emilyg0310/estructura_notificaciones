package com.example.estructura_notificaciones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Impacto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_impacto)

        //boton1
        val boton1 = findViewById<Button>(R.id.boton1)
        boton1.setOnClickListener{
            val pase_vista = Intent(this, Activity2::class.java)
            startActivity(pase_vista)
        }

        //boton2
        val boton2 = findViewById<Button>(R.id.boton2)
        boton2.setOnClickListener{
            val pase_vista = Intent(this, Esencia::class.java)
            startActivity(pase_vista)
        }

        //boton3
        val boton3 = findViewById<Button>(R.id.boton3)
        boton3.setOnClickListener{
            val pase_vista = Intent(this, Organizacion::class.java)
            startActivity(pase_vista)
        }

        //boton4
        val boton4 = findViewById<Button>(R.id.boton4)
        boton4.setOnClickListener{
            val pase_vista = Intent(this, Accionar::class.java)
            startActivity(pase_vista)
        }

        //boton5
        val boton5 = findViewById<Button>(R.id.boton5)
        boton5.setOnClickListener{
            val pase_vista = Intent(this, Impacto::class.java)
            startActivity(pase_vista)
        }
    }
}