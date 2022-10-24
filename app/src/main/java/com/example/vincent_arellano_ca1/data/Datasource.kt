package com.example.vincent_arellano_ca1.data
import com.example.vincent_arellano_ca1.R
import com.example.vincent_arellano_ca1.model.Affirmation

class Datasource {

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.ic_spin),
            Affirmation(R.string.affirmation2, R.drawable.ic_win),
            Affirmation(R.string.affirmation3, R.drawable.ic_loss)
        )
    }
}