package com.example.uiTests

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TaskActivityTest {

    @get:Rule
    var activityRule: ActivityTestRule<TaskActivity> = ActivityTestRule(TaskActivity::class.java)

    @Test
    fun testAddTask() {
        // Type text in the EditText
        onView(withId(R.id.taskName)).perform(typeText("New Task"))

        // Click the button
        onView(withId(R.id.addTaskButton)).perform(click())

        // Verify the EditText has the typed text
        onView(withId(R.id.taskName)).check(matches(withText("New Task")))
    }
}
