package com.example.botnavcleanmvp.base

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment

abstract class BaseFragment<in V : BaseView, T : BasePresenter<V>> : Fragment(), BaseView {

    protected abstract var presenter : T

    override fun getContext(): Context = activity!!.applicationContext

    override fun showError(errorString: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.attachView(this as V)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
    }

}
