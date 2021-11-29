package com.example.hiltdi.classes

import android.util.Log

class EnglishPerson {
    var TAG = EnglishPerson::class.java.simpleName + "_TAG"
    fun speakEnglish(){
        Log.i(TAG,"Hello kind sir.")
    }

}