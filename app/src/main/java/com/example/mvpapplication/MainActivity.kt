package com.example.mvpapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvpapplication.model.GanksModel
import com.example.mvpapplication.mvp.ganks.GanksContract

class MainActivity : AppCompatActivity(), GanksContract.View {

    var mPresenter: GanksContract.Presenter? = null

    companion object {
        fun getInstance(): AppCompatActivity {
            return MainActivity()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun showGanks(ganks: List<GanksModel>) {
        TODO("Not yet implemented")
    }

    override fun showTip(message: String) {
//        toast(message)
    }

    override fun showLoading() {
//        loading(Const.SHOW)
    }

    override fun hideLoading() {
//        loading(Const.SHOW)
    }

    override fun setPresenter(presnter: GanksContract.Presenter) {
        mPresenter = checkNotNull(presnter)
//        info("demo")
    }

    override fun onResume() {
        super.onResume()
        mPresenter?.start()
    }
}