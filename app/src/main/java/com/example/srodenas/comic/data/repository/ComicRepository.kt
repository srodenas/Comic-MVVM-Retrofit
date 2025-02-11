package com.example.srodenas.comic.data.repository

import com.example.srodenas.comic.data.model.ResponseComic
import com.example.srodenas.comic.data.service.ComicService
import com.example.srodenas.comic.domain.model.Comic
import com.example.srodenas.comic.domain.model.ComicRepository


/*
Repository que llama al servicio y devuelve la respuesta en el modelo del dominio.
 */
class ComicRepository : ComicRepository {
    private val comicService = ComicService() //Aquí tenemos nuestro servicio

    override suspend fun getComic(): Comic?{
        val response : ResponseComic ? = comicService.getComic() //cargo el comic aleatorio
        if (response != null)
            return Comic(response.img, response.title)
        return null
    }
}