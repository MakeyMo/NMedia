package ru.netology.trialapplication

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import ru.netology.trialapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(LayoutInflater)
        setContentView(binding.root)

    }
}