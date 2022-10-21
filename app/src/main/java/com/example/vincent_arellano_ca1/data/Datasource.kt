package com.example.vincent_arellano_ca1.data
import com.example.vincent_arellano_ca1.R
import com.example.vincent_arellano_ca1.model.Affirmation

class Datasource {

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.spinbutton),
            Affirmation(R.string.affirmation2, R.drawable.wininstruction),
            Affirmation(R.string.affirmation3, R.drawable.lossinstruction)
        )
    }
}