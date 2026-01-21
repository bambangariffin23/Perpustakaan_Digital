package com.example.perpustakaandigital

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Laprak : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnClose: Button
    private lateinit var btnActivity: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_laprak)

        btnClose = findViewById(R.id.btn_Close)
        btnActivity = findViewById(R.id.buttonStartActivity)

        // PASANG LISTENER YANG BENAR
        btnClose.setOnClickListener(this)
        btnActivity.setOnClickListener(this)

        Toast.makeText(this, "Activity: onCreate()", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "Activity: onStart()", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "Activity: onResume()", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "Activity: onPause()", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "Activity: onStop()", Toast.LENGTH_SHORT).show()
    }

    override fun onClick(view: View) {
        when (view.id) {

            R.id.buttonStartActivity -> {
                val polmanActivity = Intent(
                    Intent.ACTION_VIEW).apply {
                    Uri.parse("http://polman-bandung.ac.id")
                }
                startActivity(polmanActivity)
            }

            R.id.btn_Close -> {
                finish()
            }
        }
    }
}
