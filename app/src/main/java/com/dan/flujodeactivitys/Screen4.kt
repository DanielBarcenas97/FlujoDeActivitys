package com.dan.flujodeactivitys

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dan.flujodeactivitys.databinding.ActivityScreen4Binding

class Screen4 : AppCompatActivity() {

    private lateinit var mBinding: ActivityScreen4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityScreen4Binding.inflate(layoutInflater)
        val view = mBinding.root
        setContentView(view)

        mBinding.btnNext.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }

    }
}