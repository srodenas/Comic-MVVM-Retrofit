package com.example.srodenas.comic.domain.model

import com.example.srodenas.comic.data.model.ResponseComic
import com.example.srodenas.comic.data.service.ComicService

/*
Repository que llama al servicio y devuelve la respuesta en el modelo del dominio.
 */
class ComicRepository {
    private val comicService = ComicService() //Aquí tenemos nuestro servicio

    suspend fun getComic(): Comic?{
        val response : ResponseComic ? = comicService.getComic() //cargo el comic aleatorio
        if (response != null)
            return Comic(response.img, response.title)
        return null
    }
}