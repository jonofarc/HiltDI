package com.example.hiltdi.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hiltdi.R
import com.example.hiltdi.classes.EnglishPerson
import com.example.hiltdi.classes.SpanishPerson

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        speak()

    }

    private fun speak() {

        val englishPerson = EnglishPerson()
        val spanishPerson = SpanishPerson(englishPerson)
        spanishPerson.speakSpanish()
        spanishPerson.englishPerson.speakEnglish()

    }
}