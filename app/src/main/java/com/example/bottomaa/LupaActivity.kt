package com.example.bottomaa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LupaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lupa_password)
        val button = findViewById<View>(R.id.btncreate)
        button.setOnClickListener {
            val intent = Intent(this@LupaActivity, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}