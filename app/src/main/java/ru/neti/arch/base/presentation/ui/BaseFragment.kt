package ru.neti.arch.base.presentation.ui

import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import ru.neti.arch.app.Event

abstract class BaseFragment(@LayoutRes layoutId: Int) : Fragment(layoutId) {


    protected open fun onEvent(event: Event) {
        when (event) {
            //TODO #3 добавить обработку ошибок, сообщений
        }
    }

    override fun onPause() {
        //TODO #4 прячем клавиатуру по дефолту
        super.onPause()
    }

}

public inline fun <T> Fragment.observe(liveData: LiveData<T>, crossinline onChanged: (T) -> Unit) {
    liveData.observe(viewLifecycleOwner) { onChanged(it) }
}