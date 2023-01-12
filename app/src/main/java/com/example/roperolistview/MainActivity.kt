package com.example.roperolistview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.roperolistview.RoperoAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.roperolistview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()  {
    private lateinit var bind: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        RoperoAdapter(this,Ropero.roperoSource).also {
            roperoAdapter -> bind.ListView.adapter = roperoAdapter
        }

        bind.ListView.setOnItemClickListener(){ parent, view, position, l ->
            bind.textView.text = (parent.adapter.getItem(position) as Ropero).nombre
        }


    }


}