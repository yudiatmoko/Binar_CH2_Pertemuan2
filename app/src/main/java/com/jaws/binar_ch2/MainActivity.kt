package com.jaws.binar_ch2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.jaws.binar_ch2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var tvNameHelloWorld: TextView? = null
    private var ownerName: String? = null

    // Declare Binding and Initiate Binding
    private val binding : ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        // Change layout name into binding root
        setContentView(binding.root)
        setTextHello()
    }

    private fun setTextHello() {

        ownerName = "Ilham Yudiatmoko"

        // Old Way
//        tvNameHelloWorld = findViewById(R.id.tv_hello_world)
//        tvNameHelloWorld?.text = "Hello, I'am ${ownerName}!"
//
//        Toast.makeText(this, tvNameHelloWorld?.text, Toast.LENGTH_SHORT).show()
//        // Context in Android

        // View Binding
        binding.tvHelloWorld?.text = "Hello, I'am ${ownerName}!"
    }
}