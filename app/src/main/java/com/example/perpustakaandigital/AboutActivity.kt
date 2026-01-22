package com.example.perpustakaandigital

import com.example.perpustakaandigital.R

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val btnEmail = findViewById<Button>(R.id.btnEmail)
        val btnShare = findViewById<Button>(R.id.btnShare)

        // Intent Implisit - Email
        btnEmail.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("mailto:developer@email.com")
            intent.putExtra(Intent.EXTRA_SUBJECT, "Tentang Aplikasi Perpustakaan")
            startActivity(intent)
        }

        // Intent Implisit - Share
        btnShare.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(
                Intent.EXTRA_TEXT,
                "Coba aplikasi Perpustakaan Digital! Praktis dan mudah digunakan."
            )
            startActivity(Intent.createChooser(intent, "Bagikan via"))
        }
    }
}
