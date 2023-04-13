package com.nined77.kotlinexample

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.nined77.kotlinexample.databinding.FragmentHomeBinding


class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // inflate the layout and bind to the _binding
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.buttonLogin.setOnClickListener {
            Log.i("Click button Login", binding.buttonLogin.text.toString())
            val action = HomeFragmentDirections.actionHomeFragmentToLoginFragment();
            findNavController().navigate(action)
        }
        return binding.root // super.onCreateView(inflater, container, savedInstanceState)
    }
}