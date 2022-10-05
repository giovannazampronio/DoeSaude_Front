package com.example.doesaude.model

data class Categoria(
    var id: Long,
    var descricao: String?,
    var tipo: String?,

    var postagens: List<Postagem>?
){
    override fun toString(): String {
        return tipo!!
    }
    }