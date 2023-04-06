package com.kundalik.graphtest

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.kundalik.graphtest.databinding.ActivityMainBinding
import org.eazegraph.lib.charts.BarChart
import org.eazegraph.lib.models.BarModel


class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.show.setOnClickListener {
            setBarPlot()
        }


        binding.next.setOnClickListener {
            startActivity(Intent(this@MainActivity, SecondActivity::class.java))
        }
    }

    private fun setBarPlot() {
        val mBarChart = binding.barchart

        mBarChart.addBar(BarModel(2.3f, -0x78c0aa))
        mBarChart.addBar(BarModel(2f, -0xe00b54))
        mBarChart.addBar(BarModel(3.3f, -0x78c0aa))
        mBarChart.addBar(BarModel(1.1f, -0xe00b54))
        mBarChart.addBar(BarModel(2.7f, -0x78c0aa))
        mBarChart.addBar(BarModel(2f, -0xe00b54))
        mBarChart.addBar(BarModel(0.4f, -0x78c0aa))
        mBarChart.addBar(BarModel(4f, -0xe00b54))

        mBarChart.startAnimation()
    }

//data sets

    companion object {
        private val lineSet = listOf(
            "label1" to 5f,
            "label2" to 4.5f,
            "label3" to 4.7f,
            "label4" to 3.5f,
            "label5" to 3.6f,
            "label6" to 7.5f,
            "label7" to 7.5f,
            "label8" to 10f,
            "label9" to 5f,
            "label10" to 6.5f,
            "label11" to 3f,
            "label12" to 4f
        )

        private val barSet = listOf(
            "JAN" to 4F,
            "FEB" to 7F,
            "MAR" to 2F,
            "MAY" to 2.3F,
            "APR" to 5F,
            "JUN" to 4F
        )

        private val horizontalBarSet = listOf(
            "PORRO" to 5F,
            "FUSCE" to 6.4F,
            "EGET" to 3F
        )

        private val donutSet = listOf(
            20f,
            80f,
            100f
        )

        private const val animationDuration = 1000L

    }
}