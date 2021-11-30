package com.example.hiltdi.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hiltdi.R
import com.example.hiltdi.classes.*
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @EnglishQualifier
    @Inject
    lateinit var englishPerson: Person

    @SpanishQualifier
    @Inject
    lateinit var spanishPerson: Person




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        speak()

    }

    private fun speak() {


        englishPerson.speakLanguage()

        spanishPerson.speakLanguage()

    }
}