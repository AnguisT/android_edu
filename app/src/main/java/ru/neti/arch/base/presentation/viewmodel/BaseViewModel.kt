package ru.neti.arch.base.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.neti.arch.app.EventQueue
import ru.neti.arch.base.extensions.getValue
import ru.neti.arch.base.extensions.setValue

abstract class BaseViewModel<T : ViewState>(initialState: T? = null) : ViewModel(),
    EventsDispatcher {

    protected val liveState = MutableLiveData<T>().apply {
        initialState?.let(::setValue)
    }

    protected var state: T by liveState

    override val events = EventQueue()
}