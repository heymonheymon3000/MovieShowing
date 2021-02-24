package com.example.movieshowing.ui.splash

import android.app.Activity
import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import com.example.movieshowing.R
import com.example.movieshowing.ui.BaseActivity
import com.example.movieshowing.utils.EspressoIdlingResource
import com.firebase.ui.auth.AuthMethodPickerLayout
import com.firebase.ui.auth.AuthUI
import com.firebase.ui.auth.IdpResponse
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.Main
import timber.log.Timber

class SplashActivity :
        BaseActivity() {

    private val resultCode = 1001

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        EspressoIdlingResource.increment()
        launchSignInFlow()
    }

    private fun launchSignInFlow() {
        CoroutineScope(Main).launch {
            delay(2000L)
            startActivityForResult(
                AuthUI.getInstance()
                    .createSignInIntentBuilder()
                    .setAvailableProviders(
                        arrayListOf(
                            AuthUI.IdpConfig.GoogleBuilder().build(),
                            AuthUI.IdpConfig.EmailBuilder().build()))
                    .setIsSmartLockEnabled(true)
                    .setTheme(R.style.LoginTheme)
                    .setAuthMethodPickerLayout(
                        AuthMethodPickerLayout
                            .Builder(R.layout.layout_login)
                            .setGoogleButtonId(R.id.google_button)
                            .setEmailButtonId(R.id.email_button)
                            .build()).build(),
                resultCode, ActivityOptions.makeCustomAnimation(
                this@SplashActivity,
                android.R.anim.slide_in_left, android.R.anim.slide_out_right).toBundle())
            EspressoIdlingResource.decrement()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == resultCode) {
            val response = IdpResponse.fromResultIntent(data)
            if(resultCode == Activity.RESULT_OK) {
                Timber.d("Successfully signed in user ${FirebaseAuth.getInstance().currentUser?.displayName}!")
            } else {
                Timber.d("Sign in unsuccessful ${response?.error?.errorCode}")
            }
        }
    }
}
