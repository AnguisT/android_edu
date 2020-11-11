package ru.neti.arch.base.data

interface NetworkEntity<out T> {
    fun toDomain(): T
}