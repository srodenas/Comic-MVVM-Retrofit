package com.example.srodenas.comic.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.srodenas.comic.domain.model.Comic
import com.example.srodenas.comic.domain.useCase.ViewComicUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/*
@author santiago rodenas herráiz
@Email srodher115@g.educaand.es
23/24
*/

class ComicViewModel : ViewModel(){
    var comicLiveData  = MutableLiveData<Comic>() //será el encargado de notificar a la ui
    var progressBarLiveData =  MutableLiveData<Boolean>() //observamos cambios en el progressbar
    val useCase = ViewComicUseCase()




    fun searchByComic(){
        viewModelScope.launch(Dispatchers.IO) {
            progressBarLiveData.postValue(true)
            delay(500)  //simulo un poco de tiempo.
            val nuevoComic = useCase()
            if (nuevoComic != null)
                comicLiveData.postValue(nuevoComic!!)
            progressBarLiveData.postValue(false)


        }
    }
}