package ru.neti.arch.function.news.domain.entity

data class HomeNews(val items: List<NewsTrimmed>)
data class NewsTrimmed(val title: String, val author: AuthorTrimmed)
data class AuthorTrimmed(val nickname: String)
