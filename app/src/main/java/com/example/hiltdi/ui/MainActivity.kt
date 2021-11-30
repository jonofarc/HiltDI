package com.example.hiltdi.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hiltdi.R
import com.example.hiltdi.classes.EnglishPerson
import com.example.hiltdi.classes.SpanishPerson
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var englishPerson: EnglishPerson
    @Inject
    lateinit var spanishPerson: SpanishPerson



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        speak()

    }

    private fun speak() {


        spanishPerson.speakSpanish()
        spanishPerson.englishPerson.speakEnglish()

    }
}