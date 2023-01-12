package com.example.roperolistview

import android.content.Context
import android.content.Intent
import android.media.Image
import android.provider.MediaStore.Audio.Radio
import android.view.*
import android.widget.*
import androidx.core.content.ContextCompat.startActivity
import java.text.FieldPosition

class RoperoAdapter(context: Context, listaRopero: List<Ropero>) : ArrayAdapter<Ropero>(context,0,listaRopero) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var nombre : String
        val vista2 = convertView?: LayoutInflater.from(context).inflate(R.layout.activity_main,parent,false)
        val vista = convertView?: LayoutInflater.from(context).inflate(R.layout.ropero_esqueleto,parent,false)
        getItem(position)?.let { ropero ->
            val titulo = vista.findViewById<TextView>(R.id.titulo_esqueleto).apply{
                text = ropero.nombre
            }
            vista.findViewById<ImageView>(R.id.imagen_esqueleto).apply {
                setImageResource(ropero.imagen)
            }
            var precio = vista.findViewById<TextView>(R.id.precio_esqueleto).apply {
            }

            var rbS: RadioButton = vista.findViewById(R.id.rbS)
            var rbL: RadioButton = vista.findViewById(R.id.rbL)
            var rbXL: RadioButton = vista.findViewById(R.id.rbXL)
            var presio:Double=0.0
            rbS.setOnClickListener{
                if(rbS.isChecked){
                    presio = ropero.precio
                    precio.text = presio.toString()+" €"
                    nombre = ropero.nombre
                }
            }
            rbL.setOnClickListener{
                if(rbL.isChecked){
                    presio = ropero.precio +3
                    precio.text = presio.toString()+" €"
                    nombre = ropero.nombre
                }
            }
            rbXL.setOnClickListener{
                if(rbXL.isChecked){
                    presio = ropero.precio +5
                    precio.text = presio.toString()+" €"
                    nombre = ropero.nombre
                }


            }


            var rgG:RadioGroup=vista.findViewById(R.id.rg)

                vista.apply {
                    setOnClickListener {
                        var intent = Intent(context, TotalActivity::class.java)
                        intent.putExtra("NOMBRE", ropero.nombre)
                        intent.putExtra("IMAGEN", ropero.imagen)
                        intent.putExtra("PRECIO", presio)
                        intent.putExtra(
                            "TALLA",
                            findViewById<RadioButton>(rgG.checkedRadioButtonId).text
                        )
                        context.startActivity(intent)
                    }
                }



        }
        return vista
    }
}