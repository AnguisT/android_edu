package ru.neti.arch.base.extensions

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlin.reflect.KProperty


inline operator fun <T : Any> LiveData<T>.getValue(
    thisRef: Any?,
    property: KProperty<*>
): T = requireValue()

inline operator fun <T : Any> MutableLiveData<T>.setValue(
    thisRef: Any?,
    property: KProperty<*>,
    value: T
) {
    this.value = value
}

inline fun <T : Any> LiveData<T>.requireValue(): T = checkNotNull(value)


