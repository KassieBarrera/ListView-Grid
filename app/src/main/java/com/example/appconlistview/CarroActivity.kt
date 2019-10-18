package com.example.appconlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_carro.*
import kotlinx.android.synthetic.main.molde_carro.*

class CarroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carro)

        val bundle: Bundle = intent.extras!!
        val imagen = bundle.getInt("imagen")
        val titulo = bundle.getString("titulo")
        val desc = bundle.getString("des")
        val precio = bundle.getBoolean("venta")

        imgCarro.setImageResource(imagen)
        tituloCarro.text = titulo
        descripcionCarro.text = desc
        precioCarro.text = precio.toString()


    }
}
