package com.example.doesaude.model

data class Endereco (
    val id: Long,
    var cep: String,
    //I
    var logradouro: String,
    //I
    var cidade: String,
    //I
    var bairro: String,
    var numero: String,
   var usuario: List<Usuario>?

) {
}