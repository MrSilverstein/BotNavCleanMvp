package com.example.botnavcleanmvp.base

import android.content.Context

interface BaseView {
    fun showError(errorString: String)

    fun getContext() : Context
}