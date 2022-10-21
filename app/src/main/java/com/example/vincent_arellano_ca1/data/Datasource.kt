package com.example.vincent_arellano_ca1.data
import com.example.vincent_arellano_ca1.R
import com.example.vincent_arellano_ca1.model.Affirmation

class Datasource {

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1),
            Affirmation(R.string.affirmation2),
            Affirmation(R.string.affirmation3)
        )
    }
}