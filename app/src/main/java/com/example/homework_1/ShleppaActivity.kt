package com.example.homework_1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Toast
import android.view.Gravity

class ShleppaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shleppa)

        val message1 = intent.getStringExtra("message")

        val button = findViewById<Button>(R.id.buttonCall)
        button.setOnClickListener {
            Toast.makeText(this, message1.toString(), Toast.LENGTH_LONG).show()
        }
    }
}

