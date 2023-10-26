package com.example.univacitiproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class SetPassword : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_set_password, container, false)

        val textInputEditText = rootView.findViewById<TextInputEditText>(R.id.CreatePass)
        val textInputEditText2 = rootView.findViewById<TextInputEditText>(R.id.CreateConfirmPass)
        val minimum = rootView.findViewById<TextView>(R.id.Minimum)
        val passwordError = rootView.findViewById<TextView>(R.id.DoesNotMatch)
        val button = rootView.findViewById<MaterialButton>(R.id.SetPasswordBtn)

        // Get the NavController from the activity
        val navController = findNavController()

        button.setOnClickListener {
            val password1 = textInputEditText.text.toString()
            val password2 = textInputEditText2.text.toString()

            if (password1.length < 6) {
                minimum.visibility = View.VISIBLE
            } else {
                minimum.visibility = View.GONE

                if (password1 == password2) {
                    // Navigate to HomeFragment
                    navController.navigate(R.id.homeFragment)
                } else {
                    passwordError.visibility = View.VISIBLE
                }
            }
        }

        rootView.findViewById<View>(R.id.imageView22).setOnClickListener {
            // Navigate to the signupFragment
            navController.navigate(R.id.signUp)
        }
        rootView.findViewById<View>(R.id.imageView21).setOnClickListener {
            // Navigate to the signupFragment
            navController.popBackStack()
        }

        return rootView
    }
}