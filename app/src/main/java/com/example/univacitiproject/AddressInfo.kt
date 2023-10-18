package com.example.univacitiproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.univacitiproject.databinding.FragmentAddressInfoBinding
import com.example.univacitiproject.databinding.FragmentLoginOneBinding

class AddressInfo : Fragment() {
    private lateinit var binding:FragmentAddressInfoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_address_info, container, false)
        binding = FragmentAddressInfoBinding.bind(view)

        binding.button10.setOnClickListener {
            if(binding.residentialAddress.text.toString().isEmpty()
                || binding.stateOfResidence.text.toString().isEmpty()
                || binding.lga.text.toString().isEmpty()){
                if(binding.residentialAddress.text.toString().isEmpty()){
                    binding.residentialAddress.error = "Enter Residential Address"
                }
                if(binding.stateOfResidence.text.toString().isEmpty()){
                    binding.stateOfResidence.error = "Enter State of Residence"
                }
                if(binding.lga.text.toString().isEmpty()){
                    binding.lga.error = "Enter LGA"
                }
            }else{
                findNavController().navigate(R.id.action_addressInfo_to_bankVerification)
            }
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rollback()
        closeButton()
    }

    private fun closeButton() {
        binding.imageView16.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    private fun rollback() {
        binding.imageView14.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}