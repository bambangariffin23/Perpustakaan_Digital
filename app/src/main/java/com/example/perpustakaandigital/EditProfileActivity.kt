package com.example.perpustakaandigital


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.perpustakaandigital.R
import com.example.perpustakaandigital.ProfileActivity



class EditProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        val btnBack = findViewById<ImageButton>(R.id.btnBack)
        val btnSave = findViewById<Button>(R.id.btnSave)

        val etName = findViewById<EditText>(R.id.etName)
        val etUsername = findViewById<EditText>(R.id.etUser)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPhone = findViewById<EditText>(R.id.etNoHP)

        // Back
        btnBack.setOnClickListener {
            finish()
        }

        // Save & Send Data
        btnSave.setOnClickListener {

            val intent = Intent(this, ProfileActivity::class.java)
            intent.putExtra("name", etName.text.toString())
            intent.putExtra("username", etUsername.text.toString())
            intent.putExtra("email", etEmail.text.toString())
            intent.putExtra("phone", etPhone.text.toString())

            startActivity(intent)
            finish()
        }
    }
}