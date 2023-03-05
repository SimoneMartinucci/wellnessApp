package it.martinuccisimone.wellnessapp.ui.fragments.splash

import android.content.SharedPreferences
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import it.martinuccisimone.wellnessapp.R
import it.martinuccisimone.wellnessapp.core.di.FIRST_OPEN_SHARED_PREFERENCES
import it.martinuccisimone.wellnessapp.databinding.FragmentSplashBinding
import org.koin.android.ext.android.inject

class SplashFragment : Fragment() {

    private lateinit var binding: FragmentSplashBinding
    private val sharedPreferences: SharedPreferences by inject()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSplashBinding.inflate(layoutInflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val firstOpen = sharedPreferences.getBoolean(FIRST_OPEN_SHARED_PREFERENCES, true)


        if(!firstOpen){
            Handler(Looper.getMainLooper()).postDelayed({
                findNavController().navigate(R.id.tutorialFragment)
            }, 3000)
        }else {
            Handler(Looper.getMainLooper()).postDelayed({
                findNavController().navigate(R.id.loginFragment)
            }, 3000)
        }
    }

}