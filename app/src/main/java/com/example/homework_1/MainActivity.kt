package com.example.homework_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // val message = "Перед Вами Шлеппа"

        val button = findViewById<Button>(R.id.buttonNavigate)

        button.setOnClickListener {
            val intent = Intent(this, ShleppaActivity::class.java).apply {

            }
           // intent.putExtra("message", message)
            startActivity(intent)
        }
    }
}