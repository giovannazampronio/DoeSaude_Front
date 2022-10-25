package com.example.doesaude

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.doesaude.databinding.FragmentLoginBinding

class Login : Fragment() {

    private lateinit var binding: FragmentLoginBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentLoginBinding.inflate(layoutInflater, container, false)

        binding.buttonCadastrar.setOnClickListener {
            findNavController().navigate(R.id.action_login_to_cadastro_usuario)
        }

        binding.buttonRecuperarSenha.setOnClickListener {
            findNavController().navigate(R.id.action_login_to_recuperarSenhaFragment)
        }

        // obervar a variavel de email != String

        binding.buttonEntrar.setOnClickListener {
        val validarLogin = binding.editEmail
            if (validarLogin.text.toString() == ""){
                Toast.makeText(context, "Usuário não encontrado", Toast.LENGTH_SHORT).show()
            }else{
                findNavController().navigate(R.id.action_login_to_listFragment)
            }

        }


        return binding.root
    }

}