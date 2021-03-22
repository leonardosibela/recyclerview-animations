package com.sibela.recyclerviewanimations

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.sibela.recyclerviewanimations.databinding.ActivityFallDownBinding
import com.sibela.recyclerviewanimations.databinding.ActivitySlideInBinding

class SlideInActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySlideInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySlideInBinding.inflate(layoutInflater)
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
            layoutManager = LinearLayoutManager(this@SlideInActivity)
        }
    }
}