package ru.neti.arch.function.news.data

import ru.neti.arch.function.news.domain.HomeRepository
import ru.neti.arch.function.news.domain.entity.HomeNews

class HomeDataRepository : HomeRepository {

    override fun getNews(): HomeNews {
        TODO("#8 добавить вызов api")
    }

}