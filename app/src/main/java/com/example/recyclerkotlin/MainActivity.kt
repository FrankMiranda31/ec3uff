package com.example.recyclerkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(),RecyclerReceta.OnPersonaSelected {

    lateinit var recycler:RecyclerView
    //lateinit var listaPersonas: ArrayList<Persona>

    var listaRecetas: List<Receta> = listOf(

        Receta("https://static.vecteezy.com/system/resources/thumbnails/006/742/009/small/meat-steak-grill-pork-fried-beef-healthy-fresh-meal-food-photo.jpg","Hamburguesa","s/.43"),
        Receta("https://www.cocinacaserayfacil.net/wp-content/uploads/2020/03/Platos-de-comida-que-pides-a-domicilio-y-puedes-hacer-en-casa.jpg","pizza","s/.34"),
        Receta("https://media.istockphoto.com/id/1295633127/es/foto/carne-de-pollo-a-la-parrilla-y-ensalada-de-verduras-frescas-de-tomate-aguacate-lechuga-y.jpg?s=612x612&w=0&k=20&c=gnuOg5gI009lfvkxnObtGubcG7nVVsqH61zIZkdpc-w=","ensalada","s/.30"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        instancias();


    }

     fun instancias() {
        recycler = findViewById(R.id.lista)
        recycler.layoutManager = LinearLayoutManager(this);
        //val adapter = RecyclerPersona(this,listaPersonas)
        //listaPersonas = ArrayList<Persona>()

         recycler.adapter = RecyclerReceta(this,listaRecetas,this)

    }

    override fun onImageSelected(receta:Receta) {
        Toast.makeText(this,"PULSADO",Toast.LENGTH_LONG).show()
        val intent = Intent(this,Detalle::class.java)
        intent.putExtra("imagen",receta.imagen)
        startActivity(intent)
    }


}


