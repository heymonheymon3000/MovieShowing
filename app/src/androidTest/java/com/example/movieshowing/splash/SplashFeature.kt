package com.example.movieshowing.splash

import com.example.movieshowing.R
import com.schibsted.spain.barista.assertion.BaristaVisibilityAssertions.assertDisplayed
import org.junit.Test

class SplashFeature :
    BaseSplashUITest() {

    @Test
    fun displaysSplash() {
        assertDisplayed(R.id.splashFragment)
    }
}