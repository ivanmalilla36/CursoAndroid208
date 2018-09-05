package com.example.egghunt3r.tarea5

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var boton = findViewById<Button>(R.id.calcular)
        var ps = findViewById<EditText>(R.id.peso)
        var al = findViewById<EditText>(R.id.altura)
        var resul = findViewById<TextView>(R.id.resultado)
        var stat = findViewById<TextView>(R.id.stat)

        boton.setOnClickListener(View.OnClickListener {
            var peso = ps.text.toString()
            var altura = al.text.toString()

            Log.d("peso",peso)
            Log.d("altura",altura)

            var imc = peso.toDouble() / (altura.toDouble() * altura.toDouble())
            resul.setText("el imc es de ($imc)")

            var status = imc
            if (status > 18 || status < 24.9){
                stat.setText("El paciente se encuentra en el peso adecuado")
            }
            else {
                stat.setText("El paciente NO se encuentra en el peso adecuado")
            }

        })

    }
}
