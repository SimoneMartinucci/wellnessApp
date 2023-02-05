package it.martinuccisimone.wellnessapp.ui.fragments.tutorial
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import it.martinuccisimone.wellnessapp.R
import it.martinuccisimone.wellnessapp.databinding.FragmentTutorialBinding


class TutorialFragment : Fragment() {

    private lateinit var binding : FragmentTutorialBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTutorialBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


}