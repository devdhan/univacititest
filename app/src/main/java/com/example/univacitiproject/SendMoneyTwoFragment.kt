package com.example.univacitiproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.univacitiproject.databinding.FragmentSendMoneyTwoBinding

class SendMoneyTwoFragment : Fragment() {


    private lateinit var binding: FragmentSendMoneyTwoBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_send_money_two, container, false)
        binding = FragmentSendMoneyTwoBinding.bind(view)
        binding.btnProceed3.setOnClickListener {
            if (!binding.checkBox2.isChecked) {
                Toast.makeText(
                    requireActivity(),
                    "Beneficiary check box must be selected",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
               // binding.btnProceed3.setOnClickListener {
                  //  findNavController().navigate(R.id.action_loginFragment_to_chooseFragment2)


            }
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        backbutton()
    }

    private fun backbutton() {
        binding.backButton4.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}







