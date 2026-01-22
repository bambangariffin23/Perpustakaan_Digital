package com.example.perpustakaandigital

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CategoryBookActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_book)

        val recyclerView = findViewById<RecyclerView>(R.id.rvCategory)
        val btnBack = findViewById<Button>(R.id.btnBack)

        val categoryList = listOf(
            "Pemrograman",
            "Database",
            "Jaringan",
            "Desain",
            "Novel",
            "Pendidikan"
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CategoryAdapter(categoryList)

        // Tombol Back
        btnBack.setOnClickListener {
            finish()
        }
    }
}
