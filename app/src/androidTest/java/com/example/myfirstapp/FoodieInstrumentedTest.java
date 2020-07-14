package com.example.myfirstapp;

import android.content.Context;

import androidx.preference.Preference;
import androidx.test.espresso.intent.rule.IntentsTestRule;
import androidx.test.filters.LargeTest;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.core.AllOf.allOf;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class FoodieInstrumentedTest {

    @Rule
    //private String stringToBetyped = "Espresso";
    public ActivityTestRule<MainActivity> activityRule
            = new ActivityTestRule<>(MainActivity.class);


    @Test
    public void welcomePageTest() {

        // Ensure that Welcome page option buttons are displayed
        onView(withId(R.id.button_settings)).check(matches(withText("Settings")));
        onView(withId(R.id.button_plans)).check(matches(withText("Plans")));
        onView(withId(R.id.button_meals)).check(matches(withText("Meals")));
    }

    @Test
    public void settingsPageTest() {

        // Press button to navigate to Settings page
        onView(withId(R.id.button_settings)).perform(click());

        // Ensure that Settings page option buttons are displayed
        onView(withId(R.id.textView)).check(matches(withText("Hello blank fragment")));
        onView(withId(R.id.personal_info)).check(matches(withText("Personal Info                                              >")));
        onView(withId(R.id.password)).check(matches(withText("Change Password                                       >")));
        onView(withId(R.id.email)).check(matches(withText("Change Email                                              >")));
        onView(withId(R.id.termsAndConditions)).check(matches(withText("Terms and Conditions                               >")));
        onView(withId(R.id.giveFeedback)).check(matches(withText("Feedback                                                      >")));
    }

    @Test
    public void mealPageTest() {

        // Press button to navigate to Meals page
        onView(withId(R.id.button_meals)).perform(click());

        // Ensure that button to navigate back to welcome screen is displayed
        onView(withId(R.id.button_second)).check(matches(withText("Previous")));

        // Press button to navigate back to Welcome page
        onView(withId(R.id.button_second)).perform(click());

        // Ensure that Welcome page option buttons are displayed
        onView(withId(R.id.button_settings)).check(matches(withText("Settings")));
        onView(withId(R.id.button_plans)).check(matches(withText("Plans")));
        onView(withId(R.id.button_meals)).check(matches(withText("Meals")));
    }

    @Test
    public void plansPageTest() {

        // Press button to navigate to Plans page
        onView(withId(R.id.button_plans)).perform(click());

        // Ensure that button to navigate back to Welcome screen is displayed
        onView(withId(R.id.button_second)).check(matches(withText("Previous")));

        // Press button to navigate back to Welcome page
        onView(withId(R.id.button_second)).perform(click());

        // Ensure that Welcome page option buttons are displayed
        onView(withId(R.id.button_settings)).check(matches(withText("Settings")));
        onView(withId(R.id.button_plans)).check(matches(withText("Plans")));
        onView(withId(R.id.button_meals)).check(matches(withText("Meals")));
    }

//    @Test
//    public void personalInfoPageTest() {
//
//        // Press button to navigate to Settings page
//        onView(withId(R.id.button_settings)).perform(click());
//
//        // Press button to navigate to Personal Preferences page
//        onView(withId(R.id.personal_info)).perform(click());
//
//        // Ensure that Personal Preferences page is displayed
//        onView(withId(16908310)).perform(click());
//    }

}