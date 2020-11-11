package ru.neti.arch.function.news.domain

import ru.neti.arch.function.news.domain.entity.HomeNews

interface HomeRepository {
    fun getNews(): HomeNews
}