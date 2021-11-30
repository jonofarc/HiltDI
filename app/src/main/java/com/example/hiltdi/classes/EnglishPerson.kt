package com.example.hiltdi.classes

import android.util.Log
import javax.inject.Inject

class EnglishPerson @Inject constructor(){
    var TAG = EnglishPerson::class.java.simpleName + "_TAG"
    fun speakEnglish(){
        Log.i(TAG,"Hello kind sir.")
    }

}