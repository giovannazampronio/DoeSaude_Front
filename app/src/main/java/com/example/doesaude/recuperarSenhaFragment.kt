package com.example.doesaude

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.doesaude.databinding.FragmentRecuperarSenhaBinding


class recuperarSenhaFragment : Fragment() {

    private lateinit var binding: FragmentRecuperarSenhaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        binding = FragmentRecuperarSenhaBinding.inflate(layoutInflater, container, false)

        binding.buttonVoltarRtoL.setOnClickListener {
            findNavController().navigate(R.id.action_recuperarSenhaFragment_to_login)
        }

        return  binding.root

    }



}