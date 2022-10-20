package com.example.doesaude

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.doesaude.databinding.FragmentCadastroUsuarioBinding
import com.example.doesaude.model.Usuario

class CadastroUsuario : Fragment() {

    private lateinit var binding: FragmentCadastroUsuarioBinding
    private val mainViewModel: MainViewModel by activityViewModels()


    private var usuarioSelecionado : Usuario? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         binding = FragmentCadastroUsuarioBinding.inflate(layoutInflater, container, false)

<<<<<<< HEAD
=======
        fun validarCampos(nome: String, cpf: String, email: String,
                                  senha: String, dataNasc: String): Boolean{

            return !(
                    (nome == "" || nome.length < 5 || nome.length > 150) ||
                    (cpf == "" || cpf.length != 11) ||
                    (email == "" || email.length < 5 || email.length > 100) ||
                    (senha ==  "" || senha.length < 8 || senha.length > 50) ||
                    (dataNasc == "")
                    )

        }




        binding.buttonUserAvancar.setOnClickListener{
            findNavController().navigate(R.id.action_cadastro_usuario_to_cadastro_endereco)
        }
>>>>>>> fb57de17c59cb443dc419a1f511ec87c9f1f2f1b

        binding.buttonUserAvancar.setOnClickListener{
           inserirUsuarioBanco()
        }

        return binding.root
    }

    private fun validarCampos(
         email: String,
         nome: String,
         cpf: String,
         senha: String,
         confirmSenha: String,
         dataNascimento: String
    ): Boolean{

        return (
                (nome.isNotBlank() && nome.length in 1..50) &&
                        (email.isNotBlank() && email.length in 1..255) &&
                        (cpf.isNotBlank() && cpf.length == 11) &&
                        (senha.isNotBlank() && senha.length in 1..255) &&
                        (confirmSenha.isNotBlank() && confirmSenha.length in 1..255) &&
                        (dataNascimento.isNotBlank() && dataNascimento.length in 1..9)
                )
    }

    private fun inserirUsuarioBanco(){

        var email = binding.textEmail.text.toString()
        var nome = binding.textNome.text.toString()
        var cpf = binding.textCpf.text.toString()
        var senha = binding.textSenha.text.toString()
        var confirmSenha = binding.textSenhaConfirm.text.toString()
        var dataNascimento = binding.textDataNasc.text.toString()


        if (validarCampos(email, nome, cpf, senha, confirmSenha, dataNascimento)){
            val salvar: String

            if(usuarioSelecionado != null){
                salvar = "Usuario atualizado"
                val usuario = Usuario(usuarioSelecionado?.id!!, email, nome, cpf, senha, confirmSenha,dataNascimento)
                mainViewModel.addUsuario(usuario)
            }else {
                salvar = "Usuario criado!"
                val usuario = Usuario(0, email, nome, cpf, senha, confirmSenha, dataNascimento)
                mainViewModel.addUsuario(usuario)
            }
            Toast.makeText(context, salvar, Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_cadastro_usuario_to_cadastro_endereco)
        }else{
            Toast.makeText(context, "Verifique os Campos", Toast.LENGTH_SHORT).show()
        }
    }
}