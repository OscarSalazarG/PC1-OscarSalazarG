package com.example.pc1_oscarsalazar

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etVal1: EditText =findViewById(R.id.edTextPar)
        val etVal2: EditText =findViewById(R.id.edTextFin)
        val etVal3: EditText =findViewById(R.id.edTextPep)

        val btnCalc: Button =findViewById(R.id.btnCalc)

        btnCalc.setOnClickListener {
            this.sendVal1(etVal1.text.toString())
            this.sendVal2(etVal2.text.toString())
            this.sendVal3(etVal3.text.toString())
        }

    }
    private fun sendVal1(value1: String){
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("valor1", value1)
        startActivity(intent)
    }

    private fun sendVal2(value2: String){
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("valor2", value2)
        startActivity(intent)
    }

    private fun sendVal3(value3: String){
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("valor3", value3)
        startActivity(intent)
    }


}