package com.example.myapplication5

import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.hamcrest.CoreMatchers.not

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    var mActivityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun loginComSucesso() {
        onView(withText("Aplicativo Qazando")).check(matches(isDisplayed()))
        onView(withId(R.id.editTextTextEmailAddress)).perform(typeText("qazando@gmail.com"))
        closeSoftKeyboard()
        onView(withId(R.id.editTextTextPassword)).perform(typeText("123456"))
        closeSoftKeyboard()
        onView(withText("Logar")).perform(click())
        onView(withText("Logado com sucesso")).check(matches(isDisplayed()))
        onView(withId(R.id.button_second)).perform(click())
        onView(withText("Aplicativo Qazando")).check(matches(isDisplayed()))
    }
}