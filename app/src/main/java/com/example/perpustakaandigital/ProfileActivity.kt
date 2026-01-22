package com.example.perpustakaandigital

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val tvName = findViewById<TextView>(R.id.tvName)
        val tvUsername = findViewById<TextView>(R.id.tvUsername)
        val tvEmail = findViewById<TextView>(R.id.tvEmail)
        val tvPhone = findViewById<TextView>(R.id.tvPhone)

        val btnEdit = findViewById<Button>(R.id.btnEdit)
        val btnBack = findViewById<Button>(R.id.btnBack)

        // Terima data dari Edit Profile
        intent.extras?.let {
            tvName.text = it.getString("name", "Nama Pengguna")
            tvUsername.text = it.getString("username", "@username")
            tvEmail.text = it.getString("email", "user@email.com")
            tvPhone.text = it.getString("phone", "08xxxxxxxxxx")
        }

        // Edit Profile
        btnEdit.setOnClickListener {
            startActivity(
                android.content.Intent(this, EditProfileActivity::class.java)
            )
        }

        // Back
        btnBack.setOnClickListener {
            finish()
        }
    }
}
