package com.example.homework_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val message1 = "Перед Вами Шлеппа"

        val button = findViewById<Button>(R.id.buttonNavigate)

        button.setOnClickListener {
            val intent = Intent(this, ShleppaActivity::class.java)
            intent.putExtra("message", message1)
            startActivity(intent)
        }
    }
}