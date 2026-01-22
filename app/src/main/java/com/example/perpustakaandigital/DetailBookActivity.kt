package com.example.perpustakaandigital

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.perpustakaandigital.R

class DetailBookActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        findViewById<Button>(R.id.btnBack).setOnClickListener {
            finish()
        }
    }
}