package com.example.movieshowing.splash

import androidx.test.espresso.IdlingRegistry
import com.example.movieshowing.R
import com.example.movieshowing.utils.EspressoIdlingResource
import com.schibsted.spain.barista.assertion.BaristaVisibilityAssertions.assertDisplayed
import com.schibsted.spain.barista.assertion.BaristaVisibilityAssertions.assertNotExist
import org.junit.Test

class SplashFeature :
    BaseSplashUITest() {

    @Test
    fun displaysSplashScreen() {
        IdlingRegistry.getInstance().unregister(EspressoIdlingResource.countingIdlingResource)
        assertDisplayed(R.id.splashActivityRootLayout)
    }

    @Test
    fun hideSplashScreen() {
        assertNotExist(R.id.splashActivityRootLayout);
    }
}