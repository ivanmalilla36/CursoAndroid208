package com.example.egghunt3r.pierdapapeltijera

import android.content.Context
import android.hardware.SensorManager
import android.media.Image
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.goodcodeforfun.seismik.ShakeDetector

class MainActivity : AppCompatActivity(), ShakeDetector.Listener {
    override fun hearShake() {
        var imagen = findViewById<ImageView>(R.id.imagen)
        val random1 = (0..2).shuffled().last()
//            Toast.makeText(this,"tu numero es ${random1}",Toast.LENGTH_SHORT).show()

        when (random1) {
            0 -> imagen.setImageResource(R.drawable.pierda)
            1 -> imagen.setImageResource(R.drawable.papel)
            2 -> imagen.setImageResource(R.drawable.tijera)
        }
        Toast.makeText(this,"shake",Toast.LENGTH_SHORT).show()
    }

    private lateinit var shakeDetector: ShakeDetector

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        shakeDetector = ShakeDetector(this)

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

    override fun onStart() {
        val sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        shakeDetector.start(sensorManager)
        super.onStart()
    }

    override fun onStop() {
        shakeDetector.stop()
        super.onStop()
    }

}
