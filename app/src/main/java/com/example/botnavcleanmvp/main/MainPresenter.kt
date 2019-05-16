package com.example.botnavcleanmvp.main

import com.example.botnavcleanmvp.base.BasePresenterImpl

class MainPresenter : BasePresenterImpl<MainMvpContract.View>() , MainMvpContract.Presenter {

    override fun loadVersion() {
        view?.showVersion("ffcrf")
    }


}