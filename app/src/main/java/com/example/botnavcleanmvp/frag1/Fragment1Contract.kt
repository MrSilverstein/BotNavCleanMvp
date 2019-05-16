package com.example.botnavcleanmvp.frag1

import com.example.botnavcleanmvp.base.BasePresenter
import com.example.botnavcleanmvp.base.BaseView

object Fragment1Contract {

    interface View : BaseView{
        fun frag1View1()
    }

    interface Presenter : BasePresenter<View>{
        fun frag1pres1()
    }

}