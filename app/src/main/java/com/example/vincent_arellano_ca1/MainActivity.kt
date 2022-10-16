package com.example.vincent_arellano_ca1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the Button in the layout
        val spinButton: Button = findViewById(R.id.button)

        // Set a click listener on the button to roll the dice when the user taps the button
        spinButton.setOnClickListener { spinImage() }

        // Do a image spin when the app starts
        spinImage()

    }

    /**
     * Spin the image and update the screen with the result.
     */
    private fun spinImage() {
        // Create new Image object with 3 images and spin it
        val image = Image(3)
        val imageSpin = image.spin()



        // Find the ImageView in the layout
        val animalImage: ImageView = findViewById(R.id.imageView)
        val animalImage2: ImageView = findViewById(R.id.imageView2)
        val animalImage3: ImageView = findViewById(R.id.imageView3)
        val outcomeImage: ImageView = findViewById(R.id.imageView4)

        // Determine which drawable resource ID to use based on the image spin
        val drawableResource = when (imageSpin) {
            1 -> R.drawable.hippo
            2 -> R.drawable.lion
            else -> R.drawable.zebra
        }

        // Update the ImageView with the correct drawable resource ID
        animalImage.setImageResource(drawableResource)
        animalImage2.setImageResource(drawableResource)
        animalImage3.setImageResource(drawableResource)

        // Update the content description
        animalImage.contentDescription = imageSpin.toString()
        animalImage2.contentDescription = imageSpin.toString()
        animalImage3.contentDescription = imageSpin.toString()

        if(animalImage == animalImage2 && animalImage == animalImage3){
            outcomeImage.setImageResource(R.drawable.win)
            outcomeImage.contentDescription = imageSpin.toString()
        }
        else{
            outcomeImage.setImageResource(R.drawable.loss)
            outcomeImage.contentDescription = imageSpin.toString()
        }
    }
}

/**
 * Image object with a fixed number of images.
 */
class Image(private val numImages: Int) {

    /**
     * Do a random image spin and return the result.
     */
    fun spin(): Int {
        return (1..numImages).random()
    }
}
