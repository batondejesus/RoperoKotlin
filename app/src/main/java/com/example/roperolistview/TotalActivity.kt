package com.example.roperolistview

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TotalActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_total)
        recibirDatos()
        val buttonVolver : Button = findViewById<Button>(R.id.btnAtras)
        buttonVolver.setOnClickListener{ onBackPressed()}
    }

    private fun recibirDatos(){
        //Cogemos los extras que hemos enviado en el intent anterior
        val mibundle = intent.extras

        val tit = mibundle?.getString("NOMBRE")
        val res = findViewById<TextView>(R.id.tvTituloPrenda)
        res.text= tit.toString()

        val img = mibundle?.getInt("IMAGEN")
        img?.let { findViewById<ImageView>(R.id.imagenTotal).setImageResource(it) }

        val pre = mibundle?.getDouble("PRECIO")
        val respre = findViewById<TextView>(R.id.tvPreciototal)
        respre.text= pre.toString() + " €"

    }
}