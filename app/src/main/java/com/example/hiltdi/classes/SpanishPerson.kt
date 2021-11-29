package com.example.hiltdi.classes

import android.util.Log

class SpanishPerson(val englishPerson: EnglishPerson) {
    var TAG = SpanishPerson::class.java.simpleName + "_TAG"
    fun speakSpanish(){
        Log.i(TAG,"Despacito señor")
    }

}