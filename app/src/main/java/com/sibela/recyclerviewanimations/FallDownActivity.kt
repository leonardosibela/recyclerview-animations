package com.sibela.recyclerviewanimations

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.sibela.recyclerviewanimations.databinding.ActivityFallDownBinding

class FallDownActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFallDownBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFallDownBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = ColorsAdapter()
        adapter.submitList(
            listOf(
                Color.BLUE,
                Color.RED,
                Color.YELLOW,
                Color.GREEN,
                Color.CYAN,
                Color.MAGENTA,
                Color.DKGRAY
            )
        )

        binding.rvColors.apply {
            this.adapter = adapter
            layoutManager = LinearLayoutManager(this@FallDownActivity)
        }
    }
}