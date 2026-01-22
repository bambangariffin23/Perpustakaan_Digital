package com.example.perpustakaandigital.utils


import android.content.Context
import android.content.SharedPreferences

class SessionManager(context: Context) {

    private val prefs: SharedPreferences = context.getSharedPreferences("user_session", Context.MODE_PRIVATE)

    // Simpan username/email
    fun setUsername(username: String) {
        prefs.edit().putString("username", username).apply()
    }

    // Ambil username/email
    fun getUsername(): String? {
        return prefs.getString("username", null)
    }

    // Simpan password
    fun setPassword(password: String) {
        prefs.edit().putString("password", password).apply()
    }

    // Ambil password
    fun getPassword(): String? {
        return prefs.getString("password", null)
    }

    // Status login
    fun setLogin(isLogin: Boolean) {
        prefs.edit().putBoolean("isLogin", isLogin).apply()
    }

    fun isLogin(): Boolean {
        return prefs.getBoolean("isLogin", false)
    }

    // Hapus semua session (opsional logout)
    fun clearSession() {
        prefs.edit().clear().apply()
    }
}