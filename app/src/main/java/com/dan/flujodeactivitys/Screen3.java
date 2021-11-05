package com.dan.flujodeactivitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.dan.flujodeactivitys.databinding.ActivityScreen3Binding;

public class Screen3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
    }

    public void clicFeo(View view) {
        switch (view.getId()){
            case R.id.btnNext:
                startActivity(new Intent(this,Screen4.class));
                break;
            case R.id.btnNext2:
                Toast.makeText(this,"Click Main2", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}