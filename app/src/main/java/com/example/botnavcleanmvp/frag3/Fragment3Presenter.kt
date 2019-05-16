package com.example.botnavcleanmvp.frag3

import com.example.botnavcleanmvp.base.BasePresenterImpl
import kotlinx.coroutines.*

class Fragment3Presenter : BasePresenterImpl<Fragment3Contract.View>(), Fragment3Contract.Presenter {

    override fun frag3pres1() : String {
        GlobalScope.async(Dispatchers.IO) {
            delay(1000)
            return@async "öklsdjsökljvslkj"
        }
        return "lsfkgjfds"
    }
}