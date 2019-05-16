package com.example.botnavcleanmvp.frag2

import com.example.botnavcleanmvp.base.BasePresenterImpl
import kotlinx.coroutines.*

class Fragment2Presenter : BasePresenterImpl<Fragment2Contract.View>(), Fragment2Contract.Presenter {

    override fun frag2pres1() : String {
        GlobalScope.async(Dispatchers.IO) {
            delay(1000)
            return@async "öklsdjsökljvslkj"
        }
        return "lsfkgjfds"
    }
}