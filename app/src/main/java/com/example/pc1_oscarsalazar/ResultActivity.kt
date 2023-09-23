package com.example.pc1_oscarsalazar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val nota1 =intent.getStringExtra("valor1")
        val nota2 =intent.getStringExtra("valor2")
        val nota3 =intent.getStringExtra("valor3")

        val txtProm =findViewById<TextView>(R.id.txtViewNota)
        val txtTipo =findViewById<TextView>(R.id.txtViewTipo)

        var promedio = 10.5

        // El ID no me deja correr el código sin este If

        if (nota1 != null && nota2 != null && nota3 != null) {
            promedio = nota1.toFloat() * 0.2 + nota2.toFloat() * 0.2 + nota3.toFloat() * 0.6
        }

        txtProm.text= promedio.toString()

        if (promedio>=10.5){
            txtTipo.text= "Aprobado".toString()
        }else{
            txtTipo.text= "Desaprobado".toString()
        }



    }
}