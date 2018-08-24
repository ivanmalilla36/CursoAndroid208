package com.example.egghunt3r.toast

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.text.style.BackgroundColorSpan
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnOpenToast = findViewById<Button>(R.id.btn_opentoast)
        var fondo = findViewById<ConstraintLayout>(R.id.fondo)

        btnOpenToast.setOnClickListener(View.OnClickListener {
            Log.d("LOG","ESTE Es Un MSN")
            Toast.makeText(this, "Este es un mensaje",Toast.LENGTH_SHORT).show()
            fondo.setBackgroundColor(Color.BLUE)
        })
    }
}
