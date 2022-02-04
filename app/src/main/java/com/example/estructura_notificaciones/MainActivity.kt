package com.example.estructura_notificaciones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //boton1
        val boton_noti = findViewById<Button>(R.id.BotonNoti)
       boton_noti.setOnClickListener{
           val toast= Toast.makeText(this,"Hola desde un toast",Toast.LENGTH_SHORT)
           toast.show()}

           //boton2
           val boton_noti1 = findViewById<Button>(R.id.BotonNoti1)
           boton_noti1.setOnClickListener{
               val toast= Toast.makeText(this,"Hola desde un toast 2",Toast.LENGTH_SHORT)
               toast.show()}

               //boton3 tira text
               val el_boton = findViewById<Button>(R.id.boton_3)
               val el_text = findViewById<TextView>(R.id.textView)
               el_boton.setOnClickListener{
                   el_text.setText("Me cambiaron con un boton")

               }

        //boton3 tira text
        val el_boton1 = findViewById<Button>(R.id.boton_4)
        el_boton1.setOnClickListener{
            val pase_vista = Intent(this, Activity2::class.java)
            startActivity(pase_vista)
        }
           }
       }
