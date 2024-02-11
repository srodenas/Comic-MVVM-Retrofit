package com.example.srodenas.comic.data.network

import com.example.srodenas.comic.data.service.ApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/*
@author santiago rodenas herráiz
@Email srodher115@g.educaand.es
23/24
*/


object InstanceRetrofit {

    private const val URL_BASE = "https://xkcd.com/"


    val retrofitService : ApiService by lazy {
        getRetrofit().create(ApiService::class.java)
    }



    private fun getRetrofit() : Retrofit = Retrofit
        .Builder()
        .baseUrl(URL_BASE)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}