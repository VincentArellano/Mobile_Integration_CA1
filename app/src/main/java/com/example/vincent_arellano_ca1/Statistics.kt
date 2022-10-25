package com.example.vincent_arellano_ca1

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import androidx.databinding.DataBindingUtil
import java.text.NumberFormat
import java.util.*
import com.example.vincent_arellano_ca1.databinding.StatisticsBinding

class Statistics : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val homeBinding: StatisticsBinding = DataBindingUtil.setContentView(this, R.layout.statistics)
        homeBinding.statisticsTitle = "Statistics"
        homeBinding.backToMain = "Back"
        homeBinding.numberOfWins = "No. of Wins"
        homeBinding.numberOfSpins = "No. of Spins"
        homeBinding.winLossRatio = "Win/Loss Ratio"

        val backButton = findViewById<Button>(R.id.button6)
        backButton.setOnClickListener {
            val backIntent = Intent(this, MainActivity::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, backButton, "transition_name")
            startActivity(backIntent, options.toBundle())
        }
        Log.d("SpinImage", "Statistics... in onCreate()")


        var NumOfSpins = intent.getIntExtra("NumOfSpins", 1)
        var NumOfWins = intent.getIntExtra("NumOfWins", 1)
        var WinSpinRatio = intent.getDoubleExtra("WinSpinRatio", 1.1)
        Log.d("SpinImage","onCreate() Num of Spins = ${NumOfSpins}" + ", Num of Wins = $NumOfWins , Win/Loss Ratio = $WinSpinRatio")

        val textView = findViewById<TextView>(R.id.textView9).apply {
            text = NumOfWins.toString()
        }

        val textView2 = findViewById<TextView>(R.id.textView10).apply {
            text = NumOfSpins.toString()
        }

        val textView3 = findViewById<TextView>(R.id.textView11).apply {
            val formatStat = NumberFormat.getPercentInstance(Locale.US)
            val percentage = formatStat.format(WinSpinRatio)
            text = String.format("$percentage%")
        }
    }
}