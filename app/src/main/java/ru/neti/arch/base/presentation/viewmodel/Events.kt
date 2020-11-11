package ru.neti.arch.base.presentation.viewmodel

import androidx.navigation.NavDirections
import androidx.navigation.Navigator
import ru.neti.arch.app.Event

data class MessageEvent(val message: String) : Event
data class ErrorMessageEvent(val message: String) : Event

sealed class NavigationEvent : Event {

    abstract val rootGraph: Boolean

    data class Up(override val rootGraph: Boolean) : NavigationEvent()

    data class ToDirection(
        val direction: NavDirections,
        val extras: Navigator.Extras?,
        override val rootGraph: Boolean,
    ) : NavigationEvent()
}