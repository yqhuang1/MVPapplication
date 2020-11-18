package com.example.mvpapplication.mvp.ganks

import com.example.mvpapplication.model.GanksModel
import com.example.mvpapplication.mvp.base.BasePresenter
import com.example.mvpapplication.mvp.base.BaseView

interface GanksContract {
    interface View : BaseView<Presenter> {
        fun showGanks(ganks: List<GanksModel>)
        fun showTip(message: String)
        fun showLoading()
        fun hideLoading()
    }

    interface Presenter : BasePresenter {
        fun loadGanks()
    }
}