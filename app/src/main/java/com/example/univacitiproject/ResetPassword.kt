package com.example.univacitiproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.univacitiproject.databinding.FragmentLoginOneBinding
import com.example.univacitiproject.databinding.FragmentResetPasswordBinding

class ResetPassword : Fragment() {
    private lateinit var binding:FragmentResetPasswordBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_reset_password, container, false)
        binding = FragmentResetPasswordBinding.bind(view)
        binding.button12.setOnClickListener {
            if(binding.phoneNumber.text.toString().isEmpty()){
                Toast.makeText(
                    requireActivity(),
                    "This field cannot be empty",
                    Toast.LENGTH_SHORT
                ).show()
            }else{
                findNavController().navigate(R.id.action_resetPassword_to_resetPasswordOtpFragment)
            }
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rollBack()
    }

    private fun rollBack() {
        binding.imageView29.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}