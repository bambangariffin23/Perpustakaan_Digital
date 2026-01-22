package com.example.perpustakaandigital

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookAdapter(private val bookList: List<Book>) :
    RecyclerView.Adapter<BookAdapter.BookViewHolder>() {

    // Menghubungkan item_book.xml
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_book, parent, false)
        return BookViewHolder(view)
    }

    // Mengisi data ke tampilan
    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = bookList[position]
        holder.tvTitle.text = book.title
        holder.imgBook.setImageResource(book.imageRes)
    }

    override fun getItemCount(): Int {
        return bookList.size
    }

    // ViewHolder
    class BookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgBook: ImageView = itemView.findViewById(R.id.imgBook)
        val tvTitle: TextView = itemView.findViewById(R.id.tvBookTitle)
    }
}
