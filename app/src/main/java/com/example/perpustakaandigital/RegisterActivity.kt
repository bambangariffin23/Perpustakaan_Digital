package com.example.perpustakaandigital

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.perpustakaandigital.utils.SessionManager
import com.example.perpustakaandigital.R
import com.example.perpustakaandigital.LoginActivity

class RegisterActivity : AppCompatActivity() {

    private lateinit var etEmail: EditText
    private lateinit var etPassword: EditText
    private lateinit var etConfirmPassword: EditText
    private lateinit var btnRegister: Button
    private lateinit var tvMasuk: TextView
    private lateinit var sessionManager: SessionManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        etEmail = findViewById(R.id.editTextEmail)
        etPassword = findViewById(R.id.editTextPassword)
        etConfirmPassword = findViewById(R.id.editTextConfirmPassword)
        btnRegister = findViewById(R.id.button2)
        tvMasuk = findViewById(R.id.tvMasuk)


        sessionManager = SessionManager(this)


        btnRegister.setOnClickListener {
            registerUser()
        }


        tvMasuk.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }

    private fun registerUser() {
        val email = etEmail.text.toString().trim()
        val password = etPassword.text.toString().trim()
        val confirmPassword = etConfirmPassword.text.toString().trim()


        if (email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            Toast.makeText(this, "Semua field wajib diisi", Toast.LENGTH_SHORT).show()
            return
        }


        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            Toast.makeText(this, "Format email tidak valid", Toast.LENGTH_SHORT).show()
            return
        }


        if (password != confirmPassword) {
            Toast.makeText(this, "Password dan konfirmasi password tidak sama", Toast.LENGTH_SHORT).show()
            return
        }

        sessionManager.setUsername(email)
        sessionManager.setPassword(password)
        sessionManager.setLogin(false) // Status login = false setelah register
        sessionManager.setLogin(false)

        Toast.makeText(this, "Registrasi berhasil! Silakan login.", Toast.LENGTH_SHORT).show()


        startActivity(Intent(this, LoginActivity::class.java))
        finish()
    }
}
