package com.example.egghunt3r.proyectokotlin

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_aprendiendo_kotlin.*

data class Cursos(val nombre:String , val url:String)

class AprendiendoKotlin : Activity() {

    val reackt = Cursos("Reackt", "reackt")
    val kotlin = Cursos("Kotlin", "kotlin")
    var cursoActual = reackt.copy()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aprendiendo_kotlin)
        //Val son valores que no cambiar y var es cuando si vambian los valores.


        val boton =  findViewById<Button>(R.id.botonsito)

        boton.setOnClickListener(View.OnClickListener {
        switchCurso(cursoActual)
        })

    }

    fun switchCurso(curso: Cursos){
        val txt = findViewById<TextView>(R.id.mensaje)
        var c = curso.copy()
        when(curso.url){
            "reackt" -> cursoActual = kotlin.copy()
            "kotlin" -> cursoActual = reackt.copy()
            else -> print("nunca va a pasar")
        }
        txt.setText("Curso de ${c.nombre} en platsi.com/${c.url}")
    }

}
