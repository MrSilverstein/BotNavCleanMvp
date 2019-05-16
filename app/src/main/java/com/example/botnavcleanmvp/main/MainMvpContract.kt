package com.example.botnavcleanmvp.main

import com.example.botnavcleanmvp.base.BasePresenter
import com.example.botnavcleanmvp.base.BaseView

object MainMvpContract {

    interface View : BaseView {
        fun showVersion(version : String)
    }

    interface Presenter : BasePresenter<View> {
        fun loadVersion()
    }

}