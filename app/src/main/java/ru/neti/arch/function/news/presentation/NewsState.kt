package ru.neti.arch.function.news.presentation

import ru.neti.arch.base.presentation.viewmodel.ViewState
import ru.neti.arch.function.news.domain.entity.NewsTrimmed

data class NewsState(val news: List<NewsTrimmed>) : ViewState