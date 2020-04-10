package com.example.android.guesstheword.screens.score

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 ** create by ErixJavier on  5/04/20.
 */
class ScoreViewModelFactory(private val finalScore:Int):ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(ScoreViewModel: Class<T>): T {
        return ScoreViewModel(finalScore) as T
    }

}