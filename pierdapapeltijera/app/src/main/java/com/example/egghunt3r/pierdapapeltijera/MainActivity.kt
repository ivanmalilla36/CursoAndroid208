package com.example.egghunt3r.pierdapapeltijera

import android.media.Image
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var boton = findViewById<Button>(R.id.btn)
        var imagen = findViewById<ImageView>(R.id.imagen)

        boton.setOnClickListener(View.OnClickListener {
            val random1 = (0..2).shuffled().last()
//            Toast.makeText(this,"tu numero es ${random1}",Toast.LENGTH_SHORT).show()

            when (random1) {
                0 -> imagen.setImageResource(R.drawable.pierda)
                1 -> imagen.setImageResource(R.drawable.papel)
                2 -> imagen.setImageResource(R.drawable.tijera)
            }

        })

    }
}
