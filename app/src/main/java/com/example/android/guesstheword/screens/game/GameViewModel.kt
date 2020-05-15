package com.example.android.guesstheword.screens.game

import android.util.Log
import androidx.lifecycle.ViewModel

class GameViewModel: ViewModel() {

    init {
        Log.d("View Model","View Model in init")
    }

    override fun onCleared() {
        super.onCleared()

        Log.d("View Model","View Model destroyed")
    }
}