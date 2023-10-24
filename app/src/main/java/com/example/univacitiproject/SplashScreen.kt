package com.example.univacitiproject

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.univacitiproject.databinding.FragmentAddressInfoBinding
import com.example.univacitiproject.databinding.FragmentSplashScreenBinding

class SplashScreen : Fragment() {
    private lateinit var binding: FragmentSplashScreenBinding
    var handler: Handler? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_splash_screen, container, false)
        binding = FragmentSplashScreenBinding.bind(view)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nextScreen()
    }

    //Navigate to next screen after 3 seconds
    private fun nextScreen() {
        handler = Handler()
        handler!!.postDelayed({
            findNavController().navigate(R.id.action_splashScreen_to_signUp)
        }, 3000)
    }


}