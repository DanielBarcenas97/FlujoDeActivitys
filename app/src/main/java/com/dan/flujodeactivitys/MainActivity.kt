package com.dan.flujodeactivitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Esta es la forma fea y vieja de enlazar vistas (Vincular Vistas)
        val editEmail = findViewById<EditText>(R.id.etEmail)
        val editPassword = findViewById<EditText>(R.id.etPassword)
        val btnNext = findViewById<Button>(R.id.btnNext)
        val btnNext2 = findViewById<Button>(R.id.btnNext2)
        val btnNext3 = findViewById<Button>(R.id.btnNext3)


        btnNext.setOnClickListener(this)
        btnNext2.setOnClickListener(this)
        btnNext3.setOnClickListener(this)


    }

    //Forma implementando la interfaz onclick
    override fun onClick(view: View?) {
        if (view != null) {
            when(view.id){
                R.id.btnNext ->
                    startActivity(Intent(this,Screen2::class.java))

                R.id.btnNext2 -> Toast.makeText(this,"Click Main 2",Toast.LENGTH_SHORT).show()
                else -> Toast.makeText(this,"Click Main 3",Toast.LENGTH_SHORT).show()
            }
        }
    }
}