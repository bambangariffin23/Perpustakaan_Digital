package com.example.perpustakaandigital

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnBorrow = findViewById<Button>(R.id.btnBorrow)
        val btnHistory = findViewById<Button>(R.id.btnHistory)
        val btnCategory = findViewById<Button>(R.id.btnCategory)

        btnBorrow.setOnClickListener {
            startActivity(Intent(this, BorrowBookActivity::class.java))
        }

        btnHistory.setOnClickListener {
            startActivity(Intent(this, HistoryBorrowActivity::class.java))
        }

        btnCategory.setOnClickListener {
            startActivity(Intent(this, CategoryBookActivity::class.java))
        }
    }
}
