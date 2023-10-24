package com.example.univacitiproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.univacitiproject.databinding.FragmentSendMoneyBinding
import com.example.univacitiproject.databinding.FragmentSignUpBinding

class SignUp : Fragment() {

    private lateinit var binding: FragmentSignUpBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_sign_up, container, false)
        binding = FragmentSignUpBinding.bind(view)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        openAccount()
        login()
        reset()
    }

    private fun reset() {
        binding.textView16.setOnClickListener {
            findNavController().navigate(R.id.action_signUp_to_resetPassword)
        }
    }

    //Navigate to Login or SignUp Screen
    private fun login() {
        binding.button6.setOnClickListener {
            findNavController().navigate(R.id.action_signUp_to_loginOne)
        }
    }

    private fun openAccount() {
        binding.button5.setOnClickListener {
            findNavController().navigate(R.id.action_signUp_to_personalDetail)
        }
    }
}