package com.example.nexam.cucumber.espresso.login

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import com.example.nexam.MainActivity
import com.example.nexam.R
import org.junit.runner.RunWith
import java.lang.Thread.sleep

class LoginScreenRobot {

    fun launchLoginScreen(testRule: ActivityTestRule<MainActivity>) {
        testRule.launchActivity(null)
    }

    fun clickCreateExamButton() {
        onView(
            withText(
                InstrumentationRegistry.getInstrumentation().targetContext.getString(R.string.createExam)
            )
        ).perform(
            click()
        )

        onView(withId(R.id.input_subject)).perform(click())
    }

    fun selectSubjectField() {
        onView(withId(R.id.input_subject)).perform(click())
    }

    fun enterSubject(subject: String) {
        onView(withId(R.id.input_subject)).perform(typeText(subject))
    }

    fun closeKeyboard() {
        Espresso.closeSoftKeyboard()
        sleep(100)
    }

    fun selectTopicField() {
        onView(withId(R.id.input_topic)).perform(click())
    }

    fun enterTopic(topic: String) {
        onView(withId(R.id.input_topic)).perform(typeText(topic))
    }

    fun selectDateField() {
        onView(withId(R.id.input_date)).perform(click())
    }

    fun enterDate(date: String) {
        onView(withId(R.id.input_date)).perform(typeText(date))
    }

    fun selectContentField() {
        onView(withId(R.id.input_content)).perform(click())
    }

    fun enterContent(content: String) {
        onView(withId(R.id.input_content)).perform(typeText(content))
    }

    fun clickSaveButton() {
        onView(withText(InstrumentationRegistry.getInstrumentation().targetContext.getString(R.string.save))).perform(
            click()
        )
    }

    fun isSuccessPage(){
        onView(withId(R.id.page_exam_success)).check(matches(isDisplayed()))
    }
}