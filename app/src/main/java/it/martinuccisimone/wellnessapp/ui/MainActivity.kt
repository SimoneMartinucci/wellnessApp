package it.martinuccisimone.wellnessapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import it.martinuccisimone.wellnessapp.R
import it.martinuccisimone.wellnessapp.databinding.ActivityMainBinding
import it.martinuccisimone.wellnessapp.ui.fragments.splash.SplashFragment

class MainActivity : AppCompatActivity() {

    private lateinit var _binding : ActivityMainBinding
    private val binding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}