package com.example.perpustakaandigital

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.perpustakaandigital.R
import android.widget.TextView
import com.example.perpustakaandigital.EditProfileActivity


class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val btnBack = findViewById<Button>(R.id.btnBack)
        val btnAbout = findViewById<Button>(R.id.btnAbout)
        val btnLogout = findViewById<Button>(R.id.btnLogout)
        val btnEdit = findViewById<Button>(R.id.btnEdit)
        val btnChangePassword = findViewById<Button>(R.id.btnChangePassword)
        val tvName = findViewById<TextView>(R.id.tvName)
        val tvUsername = findViewById<TextView>(R.id.tvUsername)
        val tvEmail = findViewById<TextView>(R.id.tvEmail)
        val tvPhone = findViewById<TextView>(R.id.tvPhone)

        intent.extras?.let {
            tvName.text = it.getString("name", "Nama Pengguna")
            tvUsername.text = it.getString("username", "@username")
            tvEmail.text = it.getString("email", "user@email.com")
            tvPhone.text = it.getString("phone", "08xxxxxxxxxx")
        }

        btnAbout.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
        btnChangePassword.setOnClickListener {
            val intent = Intent(this, ChangePasswordActivity::class.java)
            startActivity(intent)
        }

        btnBack.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }
        btnLogout.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        btnEdit.setOnClickListener {
            val intent = Intent(this, EditProfileActivity::class.java)
            startActivity(intent)
        }

    }
}
