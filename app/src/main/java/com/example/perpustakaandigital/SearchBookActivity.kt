package com.example.perpustakaandigital

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SearchBookActivity : AppCompatActivity() {

    private lateinit var etSearchBook: EditText
    private lateinit var btnSearch: Button
    private lateinit var tvResult: TextView

    // Contoh daftar buku dummy
    private val bookList = listOf(
        "Harry Potter",
        "Lord of The Rings",
        "Programming Kotlin",
        "Android Development",
        "Data Science Basics",
        "Football Tactics"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_book)

        etSearchBook = findViewById(R.id.etSearchBook)
        btnSearch = findViewById(R.id.btnSearch)
        tvResult = findViewById(R.id.tvResult)

        btnSearch.setOnClickListener {
            searchBook()
        }
    }

    private fun searchBook() {
        val query = etSearchBook.text.toString().trim()

        if (query.isEmpty()) {
            Toast.makeText(this, "Masukkan nama buku untuk mencari", Toast.LENGTH_SHORT).show()
            return
        }

        // Cari buku yang mengandung kata kunci (case insensitive)
        val result = bookList.filter { it.contains(query, ignoreCase = true) }

        if (result.isEmpty()) {
            tvResult.text = "Buku tidak ditemukan"
        } else {
            tvResult.text = "Hasil ditemukan:\n" + result.joinToString("\n")
        }
    }
}
