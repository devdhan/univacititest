package com.example.univacitiproject

import android.app.DatePickerDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.univacitiproject.databinding.FragmentPersonalDetailBinding
import com.google.android.material.textfield.TextInputEditText
import java.util.Calendar

class PersonalDetail : Fragment() {
    private lateinit var binding: FragmentPersonalDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_personal_detail, container, false)
        binding = FragmentPersonalDetailBinding.bind(view)

        // Button click handler
        binding.button14.setOnClickListener {
            if (binding.surName.text.toString().isEmpty()
                || binding.firstName.text.toString().isEmpty()
                || binding.otherName.text.toString().isEmpty()
                || binding.phoneNumber.text.toString().isEmpty()
                || binding.email.text.toString().isEmpty()
                || binding.dateOfBirth.text.toString().isEmpty()
                && binding.referralCode.text.toString().isEmpty()
            ) {
                // Error handling as before
            } else {
                findNavController().navigate(R.id.action_personalDetail_to_addressInfo)
            }
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navigateBack()
        closeButton()
    }

    private fun closeButton() {
        // Handle close button click
        binding.imageView11.setOnClickListener {
            findNavController().navigate(R.id.action_personalDetail_to_signUp)
        }
    }

    private fun navigateBack() {
        // Handle back navigation button click
        binding.imageView12.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}
