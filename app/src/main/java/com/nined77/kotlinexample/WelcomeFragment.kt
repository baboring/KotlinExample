package com.nined77.kotlinexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.nined77.kotlinexample.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment(R.layout.fragment_welcome) {

    private lateinit var binding: FragmentWelcomeBinding
    //private var _args: WelcomeFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWelcomeBinding.inflate(inflater,container, false)

        arguments?.getString("username")
        binding.textViewUsername.text = arguments?.getString("username")//_args.username
        binding.textViewPassword.text = arguments?.getString("password")//_args.password

        binding.buttonOk.setOnClickListener {
            var action = WelcomeFragmentDirections.actionWelcomeFragmentToHomeFragment();
            findNavController().navigate(action)
        }
        return binding.root // super.onCreateView(inflater, container, savedInstanceState)
    }
}