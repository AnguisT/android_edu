package ru.neti.arch.function.news.presentation

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.fragment_news.*
import ru.neti.arch.R
import ru.neti.arch.app.Event
import ru.neti.arch.app.observe
import ru.neti.arch.base.presentation.ui.BaseFragment
import ru.neti.arch.base.presentation.ui.observe
import ru.neti.arch.base.presentation.viewmodel.ViewModelFactory
import ru.neti.arch.function.news.domain.entity.NewsTrimmed

class NewsFragment : BaseFragment(R.layout.fragment_news) {

    private lateinit var newsViewModel: NewsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        newsViewModel = ViewModelProvider(this, ViewModelFactory()).get(NewsViewModel::class.java)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observe(newsViewModel.news, ::initListNews)
        observe(newsViewModel.events, ::onEvent)
        initActionScreen()

    }


    private fun initActionScreen() {
        news_show_filter.setOnClickListener {
            newsViewModel.onShowFilter()
        }
    }


    private fun initListNews(data: List<NewsTrimmed>) {
        //TODO #5 отобразить список
    }

    override fun onEvent(event: Event) {
        when (event) {
            is ShowVerboseNews -> {
                //TODO #6 добавить подробный просмотр новости
            }
            is ShowFilter -> {
                showFilterDialog()
            }
            else -> {
                super.onEvent(event)
            }
        }
    }

    private fun showFilterDialog() {
        //TODO #7 добавить диалог фильтра новостей
    }


}