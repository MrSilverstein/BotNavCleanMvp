package com.example.botnavcleanmvp.frag1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.botnavcleanmvp.R
import com.example.botnavcleanmvp.base.BaseFragment

class Fragment1 : BaseFragment<Fragment1Contract.View, Fragment1Contract.Presenter>(), Fragment1Contract.View {
    override var presenter: Fragment1Contract.Presenter = Fragment1Presenter()

    override fun frag1View1() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_1, container, false)
    }

}