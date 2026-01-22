package com.example.perpustakaandigital

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.content.Intent

class HistoryBorrowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history_borrow)
        findViewById<Button>(R.id.btnBack).setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
            finish()
        }

    }
}