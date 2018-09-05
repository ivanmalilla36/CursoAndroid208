package com.example.egghunt3r.tarea5

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var boton = findViewById<Button>(R.id.calcular)
        var ps = findViewById<EditText>(R.id.peso)
        var al = findViewById<EditText>(R.id.altura)

        boton.setOnClickListener(View.OnClickListener {
            var peso = ps.text.toString()
            var altura = al.text.toString()

            Log.d("peso",peso)
            Log.d("altura",altura)

            
        })

    }
}
