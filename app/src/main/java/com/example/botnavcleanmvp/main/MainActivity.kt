package com.example.botnavcleanmvp.main

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.widget.Toast
import com.example.botnavcleanmvp.R
import com.example.botnavcleanmvp.base.BaseActivity
import com.example.botnavcleanmvp.frag1.Fragment1
import com.example.botnavcleanmvp.frag2.Fragment2
import com.example.botnavcleanmvp.frag3.Fragment3
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: BaseActivity<MainMvpContract.View, MainMvpContract.Presenter>(), MainMvpContract.View {

    override var presenter: MainMvpContract.Presenter = MainPresenter()

    override fun showVersion(version : String) {
        Toast.makeText(applicationContext, version, Toast.LENGTH_LONG).show()
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                replaceFragment(R.id.container_main_layout, Fragment1())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                replaceFragment(R.id.container_main_layout, Fragment2())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                replaceFragment(R.id.container_main_layout, Fragment3())
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        replaceFragment(R.id.container_main_layout, Fragment1())

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)


    }
}