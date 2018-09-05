package com.example.egghunt3r.operaciones

import android.content.Context
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.util.Log
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var txt1 = findViewById<EditText>(R.id.numero1)
        var txt2 =  findViewById<EditText>(R.id.numero2)
        var boton =  findViewById<Button>(R.id.suma)
        var res = findViewById<TextView>(R.id.resultado)
        var layout = findViewById<ConstraintLayout>(R.id.layout)
        var imagen = findViewById<ImageView>(R.id.imagen)

        boton.setOnClickListener(View.OnClickListener {
            var numero1 = txt1.text.toString()
            var numero2 = txt2.text.toString()

            Log.d("mainactivity", numero1)
            Log.d("mainactivity", numero2)

            var suma = numero1.toInt() + numero2.toInt()
            Log.d("suma",suma.toString())

            res.setText("el resultado es ${suma}")

            var prom = (numero1.toInt() + numero2.toInt()) / 2
            Log.d("prom",prom.toString())

            if (prom >= 70){
                layout.setBackgroundColor(Color.GREEN)
                imagen.setImageResource(R.drawable.cara)
            }
            else {
                layout.setBackgroundColor(Color.RED)
            }

            val inputManager:InputMethodManager =getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputManager.hideSoftInputFromWindow(currentFocus.windowToken, InputMethodManager.SHOW_FORCED)

        })

    }
}
