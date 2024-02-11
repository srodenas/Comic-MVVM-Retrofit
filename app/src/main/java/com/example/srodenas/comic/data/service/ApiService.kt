package com.example.srodenas.comic.data.service

import com.example.srodenas.comic.data.model.ResponseComic
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

/*
@author santiago rodenas herráiz
@Email srodher115@g.educaand.es
23/24
*/


interface ApiService {

    @GET("{idComic}/info.0.json")
    suspend fun dameComic(@Path("idComic") idComic: Int): Response<ResponseComic>

}