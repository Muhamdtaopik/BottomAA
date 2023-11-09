package com.example.bottomaa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    private var login: Button? = null
    private var username: EditText? = null
    private var password: EditText? = null
    private var lupa: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        username = findViewById<View>(R.id.username) as EditText
        password = findViewById<View>(R.id.password) as EditText
        login = findViewById<View>(R.id.loginbtn) as Button
        lupa = findViewById<TextView>(R.id.lupapassword) as TextView
        login!!.setOnClickListener { openFHome() }
        lupa!!.setOnClickListener { openLupa() }

    }

    fun openFHome() {
        if (username!!.text.toString() == "user" && password!!.text.toString() == "1234") {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this@LoginActivity, "Login Failed", Toast.LENGTH_SHORT).show()
        }
        val button = findViewById<View>(R.id.btnregister)
        button.setOnClickListener {
            val intent = Intent(this@LoginActivity, RegisterActivity::class.java)
            startActivity(intent)

            val lupa = findViewById<TextView>(R.id.lupapassword)
            lupa.setOnClickListener {
                open()
            }

        }
    }

    fun openLupa() {
        val button = findViewById<View>(R.id.lupapassword)
        button.setOnClickListener {
            val intent = Intent(this@LoginActivity, LupaActivity::class.java)
            startActivity(intent)
        }
    }
    private fun open(){
        val intent = Intent(this@LoginActivity, LupaActivity::class.java)
        startActivity(intent)

    }
}
