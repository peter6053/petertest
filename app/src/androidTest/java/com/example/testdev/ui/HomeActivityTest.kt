package com.example.testdev.ui

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import com.example.testdev.R

@RunWith(AndroidJUnit4::class)
class HomeActivityTest {

    @Test
    fun isHomeActivityInView() {
        val activityScenario = ActivityScenario.launch(HomeActivity::class.java)

        onView(withId(R.id.home)).check(matches(isDisplayed()))

        //this is sample of a ui test test whether the display layout is correct

    }
}
