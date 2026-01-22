package com.example.perpustakaandigital

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class BookByCategoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_by_category)

        val btnBack = findViewById<Button>(R.id.btnBack)
        val tvCategoryTitle = findViewById<TextView>(R.id.tvCategoryTitle)
        val recyclerBooks = findViewById<RecyclerView>(R.id.recyclerBooks)

        val categoryName = intent.getStringExtra("CATEGORY_NAME")
        tvCategoryTitle.text = categoryName ?: "Kategori Buku"

        recyclerBooks.layoutManager = LinearLayoutManager(this)

        // DATA DUMMY (UI SAJA)
        val bookList = when (categoryName) {

            "Pemrograman" -> listOf(
                Book("Kotlin Dasar", R.drawable.book_kotlin),
                Book("Android Studio", R.drawable.book_android)
            )

            "Database" -> listOf(
                Book("MySQL Dasar", R.drawable.book_mysql),
                Book("PostgreSQL", R.drawable.book_postgresql)
            )

            "Jaringan" -> listOf(
                Book("Jaringan Komputer", R.drawable.book_jaringankomputer),
                Book("Cisco Dasar", R.drawable.book_cisco)
            )

            else -> emptyList()
        }


        recyclerBooks.adapter = BookAdapter(bookList)

        btnBack.setOnClickListener {
            finish()
        }
    }
}
