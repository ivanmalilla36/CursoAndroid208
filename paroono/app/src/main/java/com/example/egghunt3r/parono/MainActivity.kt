package com.example.egghunt3r.parono

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var boton = findViewById<Button>(R.id.button)
        var num = findViewById<EditText>(R.id.numero)
        var resultado = findViewById<TextView>(R.id.res)

        boton.setBackgroundResource(R.drawable.images)
        boton.setOnClickListener(View.OnClickListener {

            val numero = num.text.toString()

            if (numero.toString().isEmpty()) {
                Toast.makeText(this, "No puedes dejara ka imagen vacia", Toast.LENGTH_LONG).show()
            }else{ if (numero.toInt() %2== 0) {
                resultado.setText("el numero es par ${numero}")
            }else{
                resultado.setText("El numero no es par ${numero}")
            }
            }


        })
    }

}
