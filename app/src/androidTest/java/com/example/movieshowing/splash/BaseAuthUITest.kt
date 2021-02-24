package com.example.movieshowing.splash

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.example.movieshowing.ui.splash.SplashActivity
import com.example.movieshowing.utils.EspressoIdlingResourceRule
import org.junit.Rule
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
abstract class BaseSplashUITest {

    @get:Rule
    val mActivityRule = ActivityTestRule(SplashActivity::class.java)

    @get: Rule
    val espressoIdlingResoureRule = EspressoIdlingResourceRule()
}