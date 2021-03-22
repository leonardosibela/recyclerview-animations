package com.sibela.recyclerviewanimations

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sibela.recyclerviewanimations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            fallDownButton.setOnClickListener {
                startActivity(Intent(this@MainActivity, FallDownActivity::class.java))
            }

            slideInButton.setOnClickListener {

            }

            scaleUpButton.setOnClickListener {

            }
        }
    }
}