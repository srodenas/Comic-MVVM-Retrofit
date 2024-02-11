package com.example.srodenas.comic.data.service

import android.util.Log
import com.example.srodenas.comic.data.model.ResponseComic
import com.example.srodenas.comic.data.network.InstanceRetrofit
import retrofit2.Response

/*
@author santiago rodenas herráiz
@Email srodher115@g.educaand.es
23/24
*/


/*
Servicio.
 */
class ComicService {

    suspend fun getComic(): ResponseComic ?{

        val id : Int = (0 until 1000).random()
        val response: Response<ResponseComic> = InstanceRetrofit.retrofitService.dameComic(id)
        if(!response.isSuccessful){
            showError()
        }
        return response.body() //Porqué puede ser nulo
    }

    private fun showError() {
        Log.i("TAG-ERROR", "Error en la llamada GET")

    }
}