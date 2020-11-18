package com.example.mvpapplication.mvp.ganks

import com.example.mvpapplication.model.GanksModel

class GanksPresenter : GanksContract.Presenter {

    var mGanksView: GanksContract.View? = null

    constructor(ganksView: GanksContract.View) {
        mGanksView = checkNotNull(ganksView)
        mGanksView!!.setPresenter(this)
    }

    override fun loadGanks() {
        mGanksView!!.showLoading()
    }

    override fun start() {
        loadGanks()
    }

    fun processGanks(ganks: List<GanksModel>) {
        mGanksView!!.showGanks(ganks)
    }

}