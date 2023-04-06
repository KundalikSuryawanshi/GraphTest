package com.kundalik.graphtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kundalik.graphtest.databinding.ActivityFifthBinding

class FifthActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFifthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFifthBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}