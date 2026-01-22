package com.example.perpustakaandigital

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.perpustakaandigital.utils.SessionManager

class ChangePasswordActivity : AppCompatActivity() {

    private lateinit var etOldPassword: EditText
    private lateinit var etNewPassword: EditText
    private lateinit var etConfirmPassword: EditText
    private lateinit var btnSavePassword: Button
    private lateinit var sessionManager: SessionManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_password)


        etOldPassword = findViewById(R.id.etOldPassword)
        etNewPassword = findViewById(R.id.etNewPassword)
        etConfirmPassword = findViewById(R.id.etConfirmPassword)
        btnSavePassword = findViewById(R.id.btnSavePassword)


        sessionManager = SessionManager(this)


        btnSavePassword.setOnClickListener {
            changePassword()
        }
    }

    private fun changePassword() {
        val oldPassword = etOldPassword.text.toString().trim()
        val newPassword = etNewPassword.text.toString().trim()
        val confirmPassword = etConfirmPassword.text.toString().trim()

        val savedPassword = sessionManager.getPassword() ?: ""


        if (oldPassword.isEmpty() || newPassword.isEmpty() || confirmPassword.isEmpty()) {
            Toast.makeText(this, "Semua field wajib diisi", Toast.LENGTH_SHORT).show()
            return
        }

        // 🛑 Validasi password lama
        if (oldPassword != savedPassword) {
            Toast.makeText(this, "Password lama salah", Toast.LENGTH_SHORT).show()
            return
        }

        // 🛑 Validasi konfirmasi password
        if (newPassword != confirmPassword) {
            Toast.makeText(this, "Password baru dan konfirmasi tidak sama", Toast.LENGTH_SHORT).show()
            return
        }

        // 🔑 Simpan password baru
        sessionManager.setPassword(newPassword)
        Toast.makeText(this, "Password berhasil diubah", Toast.LENGTH_SHORT).show()

        // Bersihkan form
        etOldPassword.text.clear()
        etNewPassword.text.clear()
        etConfirmPassword.text.clear()
    }
}
