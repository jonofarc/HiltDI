package com.example.hiltdi.classes

import android.util.Log
import javax.inject.Inject

class EnglishPerson @Inject constructor(): Person {
    var TAG = EnglishPerson::class.java.simpleName + "_TAG"


    override fun speakLanguage() {
        Log.i(TAG,"Hello kind sir.")
    }

}