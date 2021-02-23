package com.example.movieshowing.ui.splash

import android.os.Bundle
import com.example.movieshowing.R
import com.example.movieshowing.ui.BaseActivity

class SplashActivity :
        BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        showMainFragment()
    }

    private fun showMainFragment() {
        supportFragmentManager.beginTransaction()
                .replace(R.id.splash_fragment_view_container,
                        SplashFragment(), "SplashFragment")
                .commit()
    }
}