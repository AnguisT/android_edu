package ru.neti.arch.function.news.domain

import ru.neti.arch.function.news.domain.entity.NewsTrimmed

class GetNewsInteractor(private val repository: HomeRepository) {

    operator fun invoke(): List<NewsTrimmed> {
        val response = repository.getNews()
        return response.items.sortedBy { it.title }
    }
}