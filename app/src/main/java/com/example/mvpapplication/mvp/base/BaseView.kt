package com.example.mvpapplication.mvp.base

interface BaseView<T> {
    fun setPresenter(presnter: T)
}