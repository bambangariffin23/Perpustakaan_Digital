package com.example.perpustakaandigital

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.perpustakaandigital.R
import com.example.perpustakaandigital.utils.SessionManager

class LoginActivity : AppCompatActivity() {

    private lateinit var etEmail: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var tvDaftar: TextView
    private lateinit var sessionManager: SessionManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        etEmail = findViewById(R.id.editTextLoginEmail)
        etPassword = findViewById(R.id.editTextLoginPassword)
        btnLogin = findViewById(R.id.button)
        tvDaftar = findViewById(R.id.tvDaftar)


        sessionManager = SessionManager(this)


        if (sessionManager.isLogin()) {
            startActivity(Intent(this, DashboardActivity::class.java))
            finish()
            return
        }


        btnLogin.setOnClickListener {
            login()
        }

        tvDaftar.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

    private fun login() {
        val email = etEmail.text.toString().trim()
        val password = etPassword.text.toString().trim()

        val savedEmail = sessionManager.getUsername() // Ambil username/email tersimpan
        val savedPassword = sessionManager.getPassword() // Ambil password tersimpan


        if (email.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Email dan password wajib diisi", Toast.LENGTH_SHORT).show()
            return
        }


        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            Toast.makeText(this, "Format email tidak valid", Toast.LENGTH_SHORT).show()
            return
        }


        if (email == savedEmail && password == savedPassword) {
            sessionManager.setLogin(true) // Set status login = true

            Toast.makeText(this, "Login berhasil", Toast.LENGTH_SHORT).show()


            startActivity(Intent(this, DashboardActivity::class.java))
            finish()
        } else {
            Toast.makeText(this, "Email atau password salah", Toast.LENGTH_SHORT).show()
        }
    }
}

