package com.example.appconlistview

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.molde_carro.view.*

class CarrosAdaptador(context: Context, var listadecarros: ArrayList<Carro>) : BaseAdapter() {

    var contexto: Context? = context

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val carro = listadecarros[position]
        if (carro.venta == true) {
            val inflater =
                contexto!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val miVista = inflater.inflate(R.layout.card_grid, null)
            miVista.titulo.text = carro.titulo!!
            miVista.descripcion.text = carro.descripcion!!
            miVista.precio.text = carro.precio!!.toString()

            miVista.imgCard.setOnClickListener {
                val intent = Intent(contexto, CarroActivity::class.java)
                intent.putExtra("imagen", carro.imagen!!)
                intent.putExtra("titulo", carro.titulo!!);
                intent.putExtra("des", carro.descripcion!!);
                intent.putExtra("precio", carro.precio!!);
                intent.putExtra("venta", carro.venta!!);
                contexto!!.startActivity(intent)
            }
            return miVista
        } else {
            val inflater =
                contexto!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val miVista = inflater.inflate(R.layout.card_ventagrid, null)
            miVista.titulo.text = carro.titulo!!
            miVista.descripcion.text = carro.descripcion!!
            miVista.precio.text = carro.precio!!.toString()

            miVista.imgCard.setOnClickListener {
                val intent = Intent(contexto, VentaActivity::class.java)
                intent.putExtra("imagen", carro.imagen!!)
                intent.putExtra("titulo", carro.titulo!!);
                intent.putExtra("des", carro.descripcion!!);
                intent.putExtra("precio", carro.precio!!);
                intent.putExtra("venta", carro.venta!!);
                contexto!!.startActivity(intent)
            }
            return miVista
        }
    }


    override fun getItem(position: Int): Any {
        return listadecarros[0]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return listadecarros.size
    }

}