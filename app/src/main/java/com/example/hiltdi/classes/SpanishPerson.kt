package com.example.hiltdi.classes

import android.util.Log
import javax.inject.Inject

class SpanishPerson @Inject constructor(val englishPerson: EnglishPerson) {
    var TAG = SpanishPerson::class.java.simpleName + "_TAG"
    fun speakSpanish(){
        Log.i(TAG,"Despacito señor")
    }

}