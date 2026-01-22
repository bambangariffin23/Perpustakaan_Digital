package com.example.perpustakaandigital.utils

import android.content.Context
import android.content.SharedPreferences

class SessionManager(context: Context) {

    private val prefs: SharedPreferences = context.getSharedPreferences("user_session", Context.MODE_PRIVATE)

    fun setUsername(username: String) {
        prefs.edit().putString("username", username).apply()
    }


    fun getUsername(): String? {
        return prefs.getString("username", null)
    }

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

    fun clearSession() {
        prefs.edit().clear().apply()
    }
}
