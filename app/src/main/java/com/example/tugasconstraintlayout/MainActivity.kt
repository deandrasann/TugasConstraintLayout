package com.example.tugasconstraintlayout

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tugasconstraintlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.signupBtn.setOnClickListener {
            submitData()
        }
    }

    // The function to handle the Sign Up button click
    fun submitData() {
        val username = binding.usernameInputtext.text
        Toast.makeText(this, "Welcome $username", Toast.LENGTH_LONG).show()
    }


}
