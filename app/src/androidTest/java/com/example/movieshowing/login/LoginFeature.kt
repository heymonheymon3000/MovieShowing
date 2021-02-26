package com.example.movieshowing.login

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.example.movieshowing.R
import com.example.movieshowing.ui.splash.SplashActivity
import com.example.movieshowing.utils.EspressoIdlingResourceRule
import com.schibsted.spain.barista.assertion.BaristaVisibilityAssertions.assertDisplayed
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginFeature {

    @get:Rule
    val mActivityRule = ActivityTestRule(SplashActivity::class.java)

    @get: Rule
    val espressoIdlingResoureRule = EspressoIdlingResourceRule()

    @Test
    fun displayLoginScreen() {
        assertDisplayed(R.id.layoutLogin)
        assertDisplayed(R.id.splash_image)
        assertDisplayed(R.id.google_button)
        assertDisplayed(R.id.email_button)
    }
}