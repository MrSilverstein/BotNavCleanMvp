package com.example.botnavcleanmvp.frag3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.botnavcleanmvp.R
import com.example.botnavcleanmvp.base.BaseFragment

class Fragment3 : BaseFragment<Fragment3Contract.View, Fragment3Contract.Presenter>(), Fragment3Contract.View {
    override var presenter: Fragment3Contract.Presenter = Fragment3Presenter()

    override fun frag3View1() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_3, container, false)

//        et_input.keyListener.onKeyDown(_, )
    }

}