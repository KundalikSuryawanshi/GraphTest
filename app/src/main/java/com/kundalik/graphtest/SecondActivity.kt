package com.kundalik.graphtest

import android.R
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.kundalik.graphtest.databinding.ActivitySecondBinding
import org.eazegraph.lib.charts.PieChart
import org.eazegraph.lib.models.PieModel


class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.show.setOnClickListener {
            showBarChart()
        }
        binding.next.setOnClickListener {
            startActivity(Intent(this@SecondActivity, ThirdActivity::class.java))
        }


    }

    private fun showBarChart() {
        val mPieChart = binding.piechart


        mPieChart.addPieSlice(PieModel("Freetime", 15f, Color.parseColor("#FE6DA8")))
        mPieChart.addPieSlice(PieModel("Sleep", 25f, Color.parseColor("#56B7F1")))
//        mPieChart.addPieSlice(PieModel("Work", 35f, Color.parseColor("#CDA67F")))
//        mPieChart.addPieSlice(PieModel("Eating", 9f, Color.parseColor("#FED70E")))

        mPieChart.startAnimation()
    }
}