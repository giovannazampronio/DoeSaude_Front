package com.example.doesaude.api

import com.example.doesaude.model.Categoria
import com.example.doesaude.model.Postagem
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    @GET("categoria")
    suspend fun listCategoria(): Response<List<Categoria>>


    @POST
    suspend fun addPostagem(
        @Body postagem: Postagem
    ): Response<Postagem>


}