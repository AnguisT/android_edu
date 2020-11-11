package ru.neti.arch.function.news.data.entity

import ru.neti.arch.base.data.NetworkEntity
import ru.neti.arch.function.news.domain.entity.AuthorTrimmed
import ru.neti.arch.function.news.domain.entity.HomeNews
import ru.neti.arch.function.news.domain.entity.NewsTrimmed
import java.util.*


data class NewsResponse(val data: List<News>) : NetworkEntity<HomeNews> {
    override fun toDomain(): HomeNews {
        val news = data.map { item ->
            NewsTrimmed(item.title, item.author.toDomain())
        }
        return HomeNews(news)
    }
}

data class News(
    val title: String,
    val body: String,
    val author: Author,
    val lifeTime: LifeTime
)

data class Author(val name: String, val lastName: String, val nickname: String) {
    fun toDomain(): AuthorTrimmed {
        return AuthorTrimmed(nickname)
    }
}

data class LifeTime(val timeStartShow: Date, val timeEndShow: Date)