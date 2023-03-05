package it.martinuccisimone.wellnessapp.core.di

import android.content.Context
import android.content.SharedPreferences
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

const val SHARED_PREFERENCES = "wless_shared_preferences"
const val FIRST_OPEN_SHARED_PREFERENCES = "first_open_shared_preferences"

val appModule = module {
    single <SharedPreferences> {
        androidContext().getSharedPreferences(SHARED_PREFERENCES,Context.MODE_PRIVATE)
    }

}