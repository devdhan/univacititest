package com.example.univacitiproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.univacitiproject.databinding.FragmentAddressInfoBinding
import com.example.univacitiproject.databinding.FragmentBankVerificationBinding

class BankVerification : Fragment() {
    private lateinit var binding:FragmentBankVerificationBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_bank_verification, container, false)
        binding = FragmentBankVerificationBinding.bind(view)

        binding.button9.setOnClickListener {
            if (binding.enterBVN.text.toString().isEmpty()){
                if(binding.enterBVN.text.toString().isEmpty()){
                    binding.enterBVN.error = "Enter BVN"
                }
            }else if (binding.enterBVN.text.toString().isNotEmpty()){
                    if(binding.enterBVN.length() == 11){
                    }else{
                        binding.enterBVN.error = "BVN is not upto 11 digits"
                    }
            }
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rollBack()
        closeButton()
        proceed()
    }

    private fun closeButton() {
        binding.imageView17.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    private fun rollBack() {
        binding.imageView19.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    private fun proceed(){
        binding.button9.setOnClickListener {
            findNavController().navigate(R.id.action_bankVerification_to_phoneVerification)
        }
    }

}