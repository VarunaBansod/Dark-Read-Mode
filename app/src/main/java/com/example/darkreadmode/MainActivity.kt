package com.example.darkreadmode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val darkBtn = findViewById<Button>(R.id.DarkBtn)
        val readBtn = findViewById<Button>(R.id.ReadMode)
        val layoutBtn= findViewById<ConstraintLayout>(R.id.layout)

        darkBtn.setOnClickListener {
            layoutBtn.setBackgroundResource(R.color.black)
        }
        readBtn.setOnClickListener {
            layoutBtn.setBackgroundResource(R.color.yellow)
        }
    }
}