package com.example.vincent_arellano_ca1

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.vincent_arellano_ca1.adapter.ItemAdapter
import com.example.vincent_arellano_ca1.data.Datasource
import com.example.vincent_arellano_ca1.databinding.InstructionsBinding


class Instructions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val homeBinding: InstructionsBinding = DataBindingUtil.setContentView(this, R.layout.instructions)
        homeBinding.heading = "Instructions"
        homeBinding.backButton = "Back"

        val instructionsButton = findViewById<Button>(R.id.button5)
        instructionsButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, instructionsButton, "transition_name")
            startActivity(intent, options.toBundle())
        }
        // Initialize data.
        val myDataset = Datasource().loadAffirmations()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)

        Log.d("SpinImage", "Instructions... in onCreate()")
    }
}