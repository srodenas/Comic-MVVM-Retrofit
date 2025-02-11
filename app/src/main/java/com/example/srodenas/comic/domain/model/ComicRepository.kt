package com.example.srodenas.comic.domain.model

interface ComicRepository {
    suspend fun getComic(): Comic?
}