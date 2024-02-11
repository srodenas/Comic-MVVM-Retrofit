package com.example.srodenas.comic.domain.useCase

import com.example.srodenas.comic.data.model.ResponseComic
import com.example.srodenas.comic.domain.model.Comic
import com.example.srodenas.comic.domain.model.ComicRepository

class ViewComicUseCase {
    private val comicRepository = ComicRepository()

    suspend operator fun invoke(): Comic? = comicRepository.getComic()


}