package com.dan.flujodeactivitys

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dan.flujodeactivitys.databinding.ActivityScreen2Binding

class Screen2 : AppCompatActivity() {

    //Forma Recomendada

    private lateinit var mBinding: ActivityScreen2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityScreen2Binding.inflate(layoutInflater)
        val view = mBinding.root
        setContentView(view)

        mBinding.btnNext.setOnClickListener {
            startActivity(Intent(this,Screen3::class.java))
        }

        mBinding.btnNext2.setOnClickListener {
            Toast.makeText(this,"Click Main2", Toast.LENGTH_SHORT).show()
        }


        mBinding.btnNext3.setOnClickListener {
            Toast.makeText(this,"Click Main3", Toast.LENGTH_SHORT).show()
        }

    }
}


