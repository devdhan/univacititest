package com.example.univacitiproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.univacitiproject.databinding.FragmentLoginOneBinding
import com.example.univacitiproject.databinding.FragmentPersonalDetailBinding

class LoginOne : Fragment() {
    private lateinit var binding: FragmentLoginOneBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login_one, container, false)
        binding = FragmentLoginOneBinding.bind(view)
        binding.button8.setOnClickListener {
            if(binding.phoneNumber.text.toString().isEmpty() || binding.password.text.toString().isEmpty()){
                if(binding.phoneNumber.text.toString().isEmpty()){
                    binding.phoneNumber.error = "Enter Phone Number"
                }
                if(binding.password.text.toString().isEmpty()){
                    binding.password.error = "Enter password"
                }

            }else{
                findNavController().navigate(R.id.action_loginOne_to_resetPassword)
            }
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rollBack()
        proceed()
        resetPassword()
    }

    private fun resetPassword() {
        binding.textView40.setOnClickListener{
            findNavController().navigate(R.id.action_loginOne_to_resetPassword)
        }
    }

    private fun proceed() {
        binding.button8.setOnClickListener{
            findNavController().navigate(R.id.action_loginOne_to_homeFragment)
        }
    }

    private fun rollBack() {
        binding.imageView28.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}