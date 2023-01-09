package com.mohit.assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.LineGraphSeries

import com.mohit.assignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getSupportActionBar()?.hide()
        val series: LineGraphSeries<DataPoint> = LineGraphSeries(
            arrayOf(
                // on below line we are adding
                // each point on our x and y axis.
                DataPoint(0.0, 3.2),
                DataPoint(1.0, 3.0),
                DataPoint(2.0, 4.0),
                DataPoint(3.0, 9.0),
                DataPoint(4.0, 6.0),
                DataPoint(5.0, 3.0),
                DataPoint(6.0, 6.0),
                DataPoint(7.0, 1.0),
                DataPoint(8.0, 2.0)
            )
        )

        // on below line adding animation
        binding.GraphView.animate()

        // on below line we are setting scrollable
        // for point graph view
        binding.GraphView.viewport.isScrollable = true

        // on below line we are setting scalable.
        binding.GraphView.viewport.isScalable = true

        // on below line we are setting scalable y
        binding.GraphView.viewport.setScalableY(true)

        // on below line we are setting scrollable y
        binding.GraphView.viewport.setScrollableY(true)

        binding.GraphView.setBackgroundColor(getResources().getColor(R.color.greyish));
        // on below line we are setting color for series.
        series.setDrawBackground(true);
        series.setDrawDataPoints(true);
        series.setAnimated(true)
        series.color=R.color.red
        binding.GraphView.addSeries(series)
    }
}