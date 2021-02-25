package com.example.movieshowing.login

import com.example.movieshowing.R
import com.schibsted.spain.barista.assertion.BaristaVisibilityAssertions.assertDisplayed
import org.junit.Test

class LoginFeature: BaseLoginUITest() {

    @Test
    fun displayLoginScreen() {
        assertDisplayed(R.id.layoutLogin)
        assertDisplayed(R.id.splash_image)
        assertDisplayed(R.id.google_button)
        assertDisplayed(R.id.email_button)
    }
}