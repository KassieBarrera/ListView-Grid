package com.example.appconlistview

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.molde_carro.view.*

class MainActivity(var adapter: CarrosAdaptador? = null) : AppCompatActivity() {

    var listaCarros = ArrayList<Carro>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        listaCarros.add(Carro(R.drawable.tictactoe, "Bowser", "carro malvado", 150, true))
        listaCarros.add(Carro(R.drawable.tictactoe, "Mario", "carro de mario bros", 150, false))
        listaCarros.add(Carro(R.drawable.tictactoe, "Luigi", "carro de luigi bros", 150, true))
        listaCarros.add(Carro(R.drawable.tictactoe, "Peach", "carro de princesa peach", 150, false))
        listaCarros.add(Carro(R.drawable.tictactoe, "Toad", "carro del honguito toad", 150, true))
        listaCarros.add(Carro(R.drawable.tictactoe,
                "Yoshi",
                "carro de dinosaurio Joshi",
                150,
                true
            )
        )
        listaCarros.add(Carro(R.drawable.tictactoe, "Gumba", "carro de un Gumba", 150, false))

        adapter = CarrosAdaptador(this, listaCarros)
        gridView.adapter = adapter

    }

    fun borrar(indice: Int){
        listaCarros.removeAt(indice)
        adapter!!.notifyDataSetChanged()
    }

    fun agregar(indice: Int){
        listaCarros.add(listaCarros[indice])
        adapter!!.notifyDataSetChanged()
    }
}
