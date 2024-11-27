package com.belajar.testingkotlin

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.belajar.testingkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val TAG = "LoginActivity"
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = Intent(this, HomeActivity::class.java)

        binding.loginSubmit.setOnClickListener {
            val username = binding.usernameEdit.text.toString()
            val password = binding.passwordEdit.text.toString()

            if (username.isEmpty() || password.isEmpty()) {
                Log.e(TAG, "Login field kosong: username=$username, password=$password")
                Toast.makeText(this, "Username atau password tidak diisi", Toast.LENGTH_SHORT)
                    .show()
            } else if (username == "admin" && password == "password") {
                Log.i(TAG, "Login berhasil: username=$username")
                Toast.makeText(this, "Wih mantap gan 🥳", Toast.LENGTH_SHORT).show()
                startActivity(intent)
                finish()
            } else {
                Log.w(TAG, "Login gagal: username=$username, password=$password")
                Toast.makeText(this, "Username atau password salah", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
