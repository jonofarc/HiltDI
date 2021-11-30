package com.example.hiltdi.classes

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Qualifier

@Qualifier
annotation class EnglishQualifier

@Qualifier
annotation class SpanishQualifier


@Module
@InstallIn(ActivityComponent::class)
abstract  class PersonModule {

    @EnglishQualifier
    @Binds
    abstract fun EnglishPersonImpl(englishPerson: EnglishPerson):Person

    @SpanishQualifier
    @Binds
    abstract fun SpanishPersonImpl(spanishPerson: SpanishPerson):Person

}