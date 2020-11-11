package ru.neti.arch.base.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ru.neti.arch.function.news.data.HomeDataRepository
import ru.neti.arch.function.news.presentation.NewsViewModel

@Suppress("UNCHECKED_CAST")
class ViewModelFactory : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return with(modelClass) {
            when {
                isAssignableFrom(NewsViewModel::class.java) ->
                    NewsViewModel(HomeDataRepository())
                else ->
                    throw IllegalArgumentException("Unknown class: ${modelClass.name}")
            }
        } as T
    }
}