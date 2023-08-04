package com.example.recyclerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class Detalle : AppCompatActivity() {

    lateinit var imagen:ImageView
    lateinit var img:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle)

    instancias();

       img = intent.getStringExtra("imagen").toString()

       Glide.with(this).load(img).into(imagen)

    }

     fun instancias() {

         imagen = findViewById(R.id.imagendetalle)


    }


}