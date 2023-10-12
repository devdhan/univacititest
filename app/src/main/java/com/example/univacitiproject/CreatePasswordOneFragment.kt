package com.example.univacitiproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class CreatePasswordOneFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_create_password_one, container, false)

        val textInputEditText = rootView.findViewById<TextInputEditText>(R.id.passwordEditText)
        val textInputEditText2 = rootView.findViewById<TextInputEditText>(R.id.passwordErrorText)
        val errorIcon = rootView.findViewById<ImageView>(R.id.errorIcon)
        val messageTextView = rootView.findViewById<TextView>(R.id.passwordErrorTextView)
        val passwordError = rootView.findViewById<TextView>(R.id.textView3)
        val button = rootView.findViewById<MaterialButton>(R.id.button)

        // Get the NavController from the activity
        val navController = findNavController()

        button.setOnClickListener {
            val password1 = textInputEditText.text.toString()
            val password2 = textInputEditText2.text.toString()

            if (password1.length < 4) {
                errorIcon.visibility = View.VISIBLE
                messageTextView.visibility = View.VISIBLE
            } else {
                errorIcon.visibility = View.GONE
                messageTextView.visibility = View.GONE

                // Check if passwords match
                if (password1 == password2) {
                    // Navigate to HomeFragment
                    navController.navigate(R.id.homeFragment)
                } else {
                    passwordError.visibility = View.VISIBLE
                }
            }
        }
        return rootView
    }
}