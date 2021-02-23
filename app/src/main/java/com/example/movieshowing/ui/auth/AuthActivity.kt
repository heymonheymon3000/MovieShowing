package com.example.movieshowing.ui.auth

import android.os.Bundle
import com.example.movieshowing.R
import com.example.movieshowing.ui.BaseActivity

class AuthActivity :
        BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        showMainFragment()
    }

    private fun showMainFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.auth_fragment_view_container,
                    LoginFragment(), "LoginFragment")
            .commit()
    }
}