package com.example.univacitiproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.univacitiproject.databinding.FragmentPhoneVerificationBinding

class PhoneVerification : Fragment() {
    private lateinit var binding:FragmentPhoneVerificationBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_phone_verification, container, false)
        binding = FragmentPhoneVerificationBinding.bind(view)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        closeButton()
        proceed()
    }

    private fun proceed() {
        binding.imageView24.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    private fun closeButton() {
        binding.imageView25.setOnClickListener {
            findNavController().navigate(R.id.action_phoneVerification_to_signUp)
        }
    }
}