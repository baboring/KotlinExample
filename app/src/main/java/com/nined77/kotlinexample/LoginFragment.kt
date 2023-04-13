package com.nined77.kotlinexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.nined77.kotlinexample.databinding.FragmentLoginBinding

class LoginFragment : Fragment(R.layout.fragment_login){

    private lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.buttonConfirm.setOnClickListener {
            var username = binding.editTextUsername.text.toString()
            var password = binding.editTextPassword.text.toString()
            var action = LoginFragmentDirections.actionLoginFragmentToWelcomeFragment(username, password)
            findNavController().navigate(action)
        }
        return binding.root //super.onCreateView(inflater, container, savedInstanceState)
    }
}