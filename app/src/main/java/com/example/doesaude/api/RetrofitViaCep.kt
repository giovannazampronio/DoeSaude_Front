package com.example.doesaude.api

import com.example.doesaude.util.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitViaCep {

    //CONSUMIR A API EM JSON
    private val retrofitCepJson by lazy {
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL_VIACEP)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    //IMPLEMENTAR A INTERFACE
    fun apiRetrofitCepJson(): ApiServiceViaCep {
        return retrofitCepJson.create(ApiServiceViaCep::class.java)
    }




}