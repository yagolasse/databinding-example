package com.example.databindingexample.scenes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import com.example.databindingexample.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<AppCompatButton>(R.id.buttonActivity)
        val textView = findViewById<AppCompatTextView>(R.id.labelText)
        button.setOnClickListener {
            textView.setText(R.string.worked)
        }
    }
}