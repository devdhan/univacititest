package com.example.univacitiproject

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Declare the sendMoney button
        val sendMoney = view.findViewById<Button>(R.id.sendMoney)
        val bottomSheetFragment = BottomSheetFragment()

        sendMoney.setOnClickListener {
            // Use childFragmentManager to show the bottom sheet fragment
            bottomSheetFragment.show(childFragmentManager, "BottomSheetDialog")
        }
    }
}
