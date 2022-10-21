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

class Statistics : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.statistics)

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
        Log.d("SpinImage","onCreate() Num of Spins = ${NumOfSpins}" + "Num of Wins = $NumOfWins , Win/Loss Ratio = $WinSpinRatio")

        val textView = findViewById<TextView>(R.id.textView9).apply {
            text = NumOfWins.toString()
        }

        val textView2 = findViewById<TextView>(R.id.textView10).apply {
            text = NumOfSpins.toString()
        }

        val textView3 = findViewById<TextView>(R.id.textView11).apply {
            text = String.format("%.2f", WinSpinRatio)
        }
    }
}