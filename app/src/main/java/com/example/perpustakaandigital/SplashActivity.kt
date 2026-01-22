package com.example.perpustakaandigital

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.perpustakaandigital.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Delay 2 detik lalu pindah ke Login
        Handler(Looper.getMainLooper()).postDelayed({

            finish()
        }, 2000)
    }
}