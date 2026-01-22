package com.example.perpustakaandigital.activity

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.perpustakaandigital.R

class FavoriteBookActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // GANTI dengan NAMA FILE XML kamu
        // contoh: activity_favorite_book
        setContentView(R.layout.activity_favorite_book)

        // Tombol Kembali (sesuai XML)
        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish() // kembali ke activity sebelumnya
        }
    }
}
