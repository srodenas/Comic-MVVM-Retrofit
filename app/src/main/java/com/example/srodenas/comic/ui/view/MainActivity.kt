package com.example.srodenas.comic.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.core.view.isVisible
import com.bumptech.glide.Glide
import com.example.srodenas.comic.R
import com.example.srodenas.comic.databinding.ActivityMainBinding
import com.example.srodenas.comic.ui.viewmodel.ComicViewModel
/*
@author santiago rodenas herráiz
@Email srodher115@g.educaand.es
23/24
*/

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private val comicViewModel : ComicViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        registerLiveData()
        comicViewModel.searchByComic()

        binding.btnSiguiente.setOnClickListener {
            comicViewModel.searchByComic()
        }
    }

    private fun registerLiveData() {
        comicViewModel.comicLiveData.observe(
            this, {
                myComic->
                    binding.txtTitulo.text = myComic.title
                Glide
                    .with(this)
                    .load(myComic.img)
                    .centerCrop()
                    .into(binding.imageViewComic)
                Toast.makeText(this, "Acabo de mostrarte un nuevo comic", Toast.LENGTH_LONG).show()

            }
        )

        comicViewModel.progressBarLiveData.observe(
            this, {
                visible->
                        binding.progressBar.isVisible = visible
            }
        )
    }
}