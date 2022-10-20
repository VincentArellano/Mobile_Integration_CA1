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

class Statistics : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.statistics)

        val instructionsButton = findViewById<Button>(R.id.button6)
        instructionsButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        Log.d("SpinImage", "Statistics... in onCreate()")

        val numOfWins = intent.getIntExtra("numOfWins", 1)
        val numOfSpins = intent.getIntExtra("numOfSpins", 1)
        val winSpinRatio = intent.getDoubleExtra("winSpinRatio", 1.1)
        Log.d("SpinImage","onCreate() Num of Wins = ${numOfWins}" + "Num of Spins = $numOfSpins , Win/Loss Ratio = $winSpinRatio")

        val textView = findViewById<TextView>(R.id.textView9).apply {
            text = numOfWins.toString()
        }

        val textView2 = findViewById<TextView>(R.id.textView10).apply {
            text = numOfWins.toString()
        }

        val textView3 = findViewById<TextView>(R.id.textView11).apply {
            text = numOfWins.toString()
        }
    }
}