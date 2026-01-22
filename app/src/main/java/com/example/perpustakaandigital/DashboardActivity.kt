package com.example.perpustakaandigital

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        // ===== SEARCH & PROFILE =====
        val etSearch = findViewById<EditText>(R.id.et_search)
        val cardProfile = findViewById<CardView>(R.id.card_profile)

        // ===== MENU BUTTON =====
        val btnListBook = findViewById<Button>(R.id.btn_list_book)
        val btnDetailBook = findViewById<Button>(R.id.btn_detail_book)
        val btnBorrowBook = findViewById<Button>(R.id.btn_borrow_book)
        val btnHistoryBorrow = findViewById<Button>(R.id.btn_history_borrow)
        val btnFavorite = findViewById<Button>(R.id.btn_favorite)
        val btnCategoryBook = findViewById<Button>(R.id.btn_category_book)

        // =========================
        // INTENT NAVIGATION
        // =========================

        // SEARCH → SearchBookActivity
        etSearch.setOnClickListener {
            startActivity(Intent(this, SearchBookActivity::class.java))
        }

        // PROFILE → ProfileActivity
        cardProfile.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        // LIST BOOK
        btnListBook.setOnClickListener {
            startActivity(Intent(this, ListBookActivity::class.java))
        }

        // DETAIL BOOK
        btnDetailBook.setOnClickListener {
            startActivity(Intent(this, DetailBookActivity::class.java))
        }

        // BORROW BOOK
        btnBorrowBook.setOnClickListener {
            startActivity(Intent(this, BorrowBookActivity::class.java))
        }

        // HISTORY BORROW
        btnHistoryBorrow.setOnClickListener {
            startActivity(Intent(this, HistoryBorrowActivity::class.java))
        }

        // FAVORITE
        btnFavorite.setOnClickListener {
            startActivity(Intent(this, FavoriteActivity::class.java))
        }

        // CATEGORY BOOK
        btnCategoryBook.setOnClickListener {
            startActivity(Intent(this, CategoryBookActivity::class.java))
        }
    }
}
