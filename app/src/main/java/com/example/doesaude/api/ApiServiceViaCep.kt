package com.example.doesaude.api

import com.example.doesaude.model.CEP
import com.example.doesaude.model.Endereco
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiServiceViaCep {

    @GET("{CEP}/json/")
    fun getEndereco(@Path("CEP") CEP : String) : Call<CEP>
}