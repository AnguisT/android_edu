package ru.neti.arch.function.news.presentation

import androidx.lifecycle.distinctUntilChanged
import androidx.lifecycle.map
import ru.neti.arch.base.presentation.viewmodel.BaseViewModel
import ru.neti.arch.function.news.domain.GetNewsInteractor
import ru.neti.arch.function.news.domain.HomeRepository

class NewsViewModel(private val repository: HomeRepository) : BaseViewModel<NewsState>() {

    val news = liveState.map { it.news }.distinctUntilChanged()

    init {
        state = NewsState( emptyList())
        getNews()
        getNews2()
    }

    private fun getNews2() {
        val result = GetNewsInteractor(repository).invoke()
        state = state.copy(news = result)
    }

    private fun getNews() {
        state = state.copy(news = repository.getNews().items)
    }

    fun onShowFilter() {
        events.offerEvent(ShowFilter())
    }
}