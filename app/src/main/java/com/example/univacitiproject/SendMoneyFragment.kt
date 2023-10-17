package com.example.univacitiproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.univacitiproject.databinding.FragmentSendMoneyBinding


class SendMoneyFragment : Fragment() {


    private lateinit var binding: FragmentSendMoneyBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view =  inflater.inflate(R.layout.fragment_send_money, container, false)
        binding = FragmentSendMoneyBinding.bind(view)
        binding.btnProceed3.setOnClickListener {
            if (binding.edtAmt.text.toString().isEmpty()) {
                Toast.makeText(
                    requireActivity(),
                    "This field cannot be empty",
                    Toast.LENGTH_SHORT
                ).show()

            } else {
                binding.btnProceed3.setOnClickListener {
                  //  findNavController().navigate(R.id.action_sendMoneyFragment_to_sendMoneyTwoFragment)
                }
            }
        }


        return view
    }
    fun selectDebitAccount(){

    }
}