package com.example.botnavcleanmvp.frag3

import com.example.botnavcleanmvp.base.BasePresenter
import com.example.botnavcleanmvp.base.BaseView

object Fragment3Contract {

    interface View : BaseView{
        fun frag3View1()
    }

    interface Presenter : BasePresenter<View>{
        fun frag3pres1() : String
    }

}