package com.example.movieshowing.auth

import com.example.movieshowing.R
import com.schibsted.spain.barista.assertion.BaristaVisibilityAssertions.assertDisplayed
import org.junit.Test

class LauncherFeature :
        BaseAuthUITest() {

    @Test
    fun displaysEmailInput() {
        assertDisplayed(R.id.input_email)
    }

    @Test
    fun displaysPasswordInput() {
        assertDisplayed(R.id.input_password)
    }

    @Test
    fun displaysLoginButton() {
        assertDisplayed(R.id.login_button)
    }

    @Test
    fun displaysSignupButton() {
        assertDisplayed(R.id.signup_button)
    }
}