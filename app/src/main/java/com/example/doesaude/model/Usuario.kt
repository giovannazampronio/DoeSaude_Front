package com.example.doesaude.model

<<<<<<< HEAD
data class Usuario (
    var id: Long,
    var email: String,
    var nome: String,
    var cpf: String,
    //var telefone: String,
    var senha: String,
    var confirmSenha: String,
    var dataNascimento: String,
    //var endereco: String
        ) {
=======

class Usuario(
    val id: Long,
    var nome: String,
    val cpf: String,
    var email: String,
    var telefone: String,
    var senha: String,
    var dataNasc: String,
    var endereco: Endereco
) {
>>>>>>> fb57de17c59cb443dc419a1f511ec87c9f1f2f1b
}