package com.example.nexam.cucumber.steps

import androidx.test.rule.ActivityTestRule
import com.example.nexam.MainActivity
import com.example.nexam.cucumber.espresso.login.LoginScreenRobot
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

class CreateExamStep {
    private val robot = LoginScreenRobot()
    private val activityRule = ActivityTestRule(MainActivity::class.java, false, false)

    @Given("^I start the application$")
    fun i_start_app() {
        robot.launchLoginScreen(activityRule)
    }

    @When("^I click create exam button$")
    fun i_click_create_exam_button() {
        robot.clickCreateExamButton()
    }

    @And("^I click subject filed$")
    fun i_click_subject_field() {
        robot.selectSubjectField()
    }

    @And("^I enter subject (\\s+$")
    fun i_enter_subject(subject: String) {
        robot.enterSubject(subject)
    }

    @And("^I close the keyboard")
    fun i_close_the_keyboard() {
        robot.closeKeyboard()
    }

    @And("^I click topic filed$")
    fun i_click_topic_field() {
        robot.selectTopicField()
    }

    @And("^I enter topic (\\s+$")
    fun i_enter_topic(topic: String) {
        robot.enterTopic(topic)
    }

    @And("^I click date filed$")
    fun i_click_date_field() {
        robot.selectDateField()
    }

    @And("^I enter valid date (\\s+$")
    fun i_enter_valid_date(date: String) {
        robot.enterDate(date)
    }

    @And("^I click content filed$")
    fun i_click_content_field() {
        robot.selectContentField()
    }


    @And("^I enter content (\\s+$")
    fun i_enter_content(content: String) {
        robot.enterContent(content)
    }

    @And("^I click save button$")
    fun i_click_save_button() {
        robot.clickSaveButton()
    }

    @Then("^I expect to seet success page")
    fun i_expect_to_see_success_page() {
        robot.isSuccessPage()
    }
}