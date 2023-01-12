package com.example.roperolistview

import android.widget.ImageView

data class Ropero(val nombre: String, val imagen: Int, val precio: Double ){
    companion object{
        val roperoSource = listOf(
            Ropero("Calcetin rojo", R.drawable.calcetin, 1.0),
            Ropero("Calcetin gris", R.drawable.calcetin1, 1.0),
            Ropero("Calcetin caballo", R.drawable.calcetin2, 3.0),
            Ropero("Calcetin azul largo", R.drawable.calcetin3, 4.0),
            Ropero("Calcetin a rallas", R.drawable.calcetin4, 3.0),
            Ropero("Camiseta de cebra", R.drawable.camiseta, 8.0),
            Ropero("Camiseta winnie", R.drawable.camiseta2, 9.0),
            Ropero("Camiseta minion", R.drawable.camiseta3, 10.0),
            Ropero("Camiseta rosa", R.drawable.camiseta4, 8.0),
            Ropero("Gorra beige", R.drawable.gorra, 12.0),

        )
    }
    override fun toString(): String {
        return nombre
    }
}
