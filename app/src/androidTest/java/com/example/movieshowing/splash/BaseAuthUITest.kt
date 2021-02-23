package com.example.movieshowing.splash

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.example.movieshowing.ui.splash.SplashActivity
import org.junit.Rule
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
abstract class BaseSplashUITest {

    val mActivityRule = ActivityTestRule(SplashActivity::class.java)
        @Rule get
}