package com.belajar.testingkotlin

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.belajar.testingkotlin.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    private val TAG = "HomeActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = Intent(this, MainActivity::class.java)

        binding.logoutBtn.setOnClickListener {
            Log.i(TAG, "User berhasil logout")
            Toast.makeText(this, "Anda Berhasil Logout", Toast.LENGTH_SHORT).show()
            startActivity(intent)
            finish()
        }
    }
}
