package com.example.botnavcleanmvp.base

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity<in V : BaseView, T : BasePresenter<V>> : AppCompatActivity(), BaseView {

    protected abstract var presenter : T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        @Suppress("UNCHECKED_CAST")
        presenter.attachView(this as V)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
    }

    override fun showError(errorString: String) {
    }

    override fun getContext(): Context = this

    fun replaceFragment(resId : Int, newFragment : Fragment){
        this.supportFragmentManager?.beginTransaction()?.replace(resId, newFragment)?.addToBackStack(null)?.commit()
    }
}