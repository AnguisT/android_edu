package ru.neti.arch.function.news.presentation

import ru.neti.arch.app.Event
import ru.neti.arch.function.news.domain.entity.NewsTrimmed

data class ShowVerboseNews(val news: NewsTrimmed) : Event
class ShowFilter : Event