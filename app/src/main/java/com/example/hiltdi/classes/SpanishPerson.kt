package com.example.hiltdi.classes

import android.util.Log
import javax.inject.Inject

class SpanishPerson @Inject constructor():Person {
    var TAG = SpanishPerson::class.java.simpleName + "_TAG"

    override fun speakLanguage() {
        Log.i(TAG,"Despacito señor")
    }

}