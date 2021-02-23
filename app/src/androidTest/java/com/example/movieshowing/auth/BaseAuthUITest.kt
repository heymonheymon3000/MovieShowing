package com.example.movieshowing.auth

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.example.movieshowing.ui.auth.AuthActivity
import org.junit.Rule
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
abstract class BaseAuthUITest {

    val mActivityRule = ActivityTestRule(AuthActivity::class.java)
        @Rule get
}