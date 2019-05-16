package com.example.botnavcleanmvp.frag2

import com.example.botnavcleanmvp.base.BasePresenter
import com.example.botnavcleanmvp.base.BaseView

object Fragment2Contract {

    interface View : BaseView{
        fun frag2View1()
    }

    interface Presenter : BasePresenter<View>{
        fun frag2pres1() : String
    }

}