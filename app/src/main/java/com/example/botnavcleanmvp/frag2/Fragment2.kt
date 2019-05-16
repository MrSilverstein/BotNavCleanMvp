package com.example.botnavcleanmvp.frag2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.botnavcleanmvp.R
import com.example.botnavcleanmvp.base.BaseFragment

class Fragment2 : BaseFragment<Fragment2Contract.View, Fragment2Contract.Presenter>(), Fragment2Contract.View {
    override var presenter: Fragment2Contract.Presenter = Fragment2Presenter()

    override fun frag2View1() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_2, container, false)

        presenter.frag2pres1()
    }

}