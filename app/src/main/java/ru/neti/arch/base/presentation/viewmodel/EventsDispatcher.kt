package ru.neti.arch.base.presentation.viewmodel

import androidx.navigation.NavDirections
import androidx.navigation.Navigator
import ru.neti.arch.app.EventQueue

interface EventsDispatcher {

    val events: EventQueue

    fun showMessage(message: String) {
        events.offerEvent(MessageEvent(message))
    }

    fun showError(message: String) {
        events.offerEvent(ErrorMessageEvent(message))
    }

    fun navigateTo(
        direction: NavDirections,
        extras: Navigator.Extras? = null,
        rootGraph: Boolean = false
    ) {
        events.offerEvent(NavigationEvent.ToDirection(direction, extras, rootGraph))
    }

    fun navigateUp(rootGraph: Boolean = false) {
        events.offerEvent(NavigationEvent.Up(rootGraph))
    }
}