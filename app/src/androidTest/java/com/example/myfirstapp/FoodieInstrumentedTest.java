package com.example.myfirstapp;

import android.content.Context;

import androidx.preference.Preference;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.filters.LargeTest;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.rule.ActivityTestRule;

import java.util.Random;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withEffectiveVisibility;
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
        onView(withId(R.id.textView)).check(matches(withText("Settings")));
        onView(withId(R.id.button_login)).check(matches(withText("Login/Register                                            >")));
        onView(withId(R.id.termsAndConditions)).check(matches(withText("Terms and Conditions                               >")));
        onView(withId(R.id.giveFeedback)).check(matches(withText("Feedback                                                      >")));
    }

    @Test
    public void mealPageTest() {

        // Press button to navigate to Meals page
        onView(withId(R.id.button_meals)).perform(click());

        // Ensure that Meal options are displayed
        onView(withId(R.id.mealOption1Text)).check(matches(withText("Chicken Parmesan")));
        onView(withId(R.id.mealOption2Text)).check(matches(withText("Sweet Potato Tacos")));
        onView(withId(R.id.mealOption3Text)).check(matches(withText("White Chicken Chili")));
        onView(withId(R.id.mealOption4Text)).check(matches(withText("Shrimp Stir Fry")));
        onView(withId(R.id.mealOption5Text)).check(matches(withText("Southwestern Quinoa Salad")));
        onView(withId(R.id.mealOption6Text)).check(matches(withText("Pineapple Salmon")));
        onView(withId(R.id.mealOption7Text)).check(matches(withText("Sweet and Sour Cauliflower")));
        onView(withId(R.id.mealOption8Text)).check(matches(withText("Taco Stuffed Sweet Potato")));
    }

    @Test
    public void mealOption1Test() {

        // Press button to navigate to Meals page
        onView(withId(R.id.button_meals)).perform(click());

        // Press button to navigate to Meal Option 1 page
        onView(withId(R.id.mealOption1)).perform(click());

        // Ensure that Meal options are displayed
        onView(withId(R.id.MealOptionName)).check(matches(withText("Chicken Parmesan")));
        onView(withId(R.id.MealCalories)).check(matches(withText("459kcal")));
        onView(withId(R.id.mealFat)).check(matches(withText("25g")));
        onView(withId(R.id.mealSaturatedFat)).check(matches(withText("10g")));
        onView(withId(R.id.mealCarbohydrates)).check(matches(withText("16g")));
        onView(withId(R.id.mealFiber)).check(matches(withText("2g")));
        onView(withId(R.id.mealSugar)).check(matches(withText("4g")));
        onView(withId(R.id.mealProtein)).check(matches(withText("42g")));
        onView(withId(R.id.mealAllergy)).check(matches(withText("Gluten, Dairy")));
    }

    @Test
    public void mealOption2Test() {

        // Press button to navigate to Meals page
        onView(withId(R.id.button_meals)).perform(click());

        // Press button to navigate to Meal Option 1 page
        onView(withId(R.id.mealOption2)).perform(click());

        // Ensure that Meal options are displayed
        onView(withId(R.id.MealOptionName)).check(matches(withText("Sweet Potato Tacos")));
        onView(withId(R.id.MealCalories)).check(matches(withText("391kcal")));
        onView(withId(R.id.mealFat)).check(matches(withText("8g")));
        onView(withId(R.id.mealSaturatedFat)).check(matches(withText("1g")));
        onView(withId(R.id.mealCarbohydrates)).check(matches(withText("69g")));
        onView(withId(R.id.mealFiber)).check(matches(withText("16g")));
        onView(withId(R.id.mealSugar)).check(matches(withText("10g")));
        onView(withId(R.id.mealProtein)).check(matches(withText("13g")));
        onView(withId(R.id.mealAllergy)).check(matches(withText("Dairy")));
    }

    @Test
    public void mealOption3Test() {

        // Press button to navigate to Meals page
        onView(withId(R.id.button_meals)).perform(click());

        // Press button to navigate to Meal Option 1 page
        onView(withId(R.id.mealOption3)).perform(click());

        // Ensure that Meal options are displayed
        onView(withId(R.id.MealOptionName)).check(matches(withText("White Chicken Chili")));
        onView(withId(R.id.MealCalories)).check(matches(withText("495kcal")));
        onView(withId(R.id.mealFat)).check(matches(withText("17.8g")));
        onView(withId(R.id.mealSaturatedFat)).check(matches(withText("3.3g")));
        onView(withId(R.id.mealCarbohydrates)).check(matches(withText("42g")));
        onView(withId(R.id.mealFiber)).check(matches(withText("8.4g")));
        onView(withId(R.id.mealSugar)).check(matches(withText("8.8g")));
        onView(withId(R.id.mealProtein)).check(matches(withText("45.7g")));
        onView(withId(R.id.mealAllergy)).check(matches(withText("None")));
    }

    @Test
    public void mealOption4Test() {

        // Press button to navigate to Meals page
        onView(withId(R.id.button_meals)).perform(click());

        // Press button to navigate to Meal Option 1 page
        onView(withId(R.id.mealOption4)).perform(click());

        // Ensure that Meal options are displayed
        onView(withId(R.id.MealOptionName)).check(matches(withText("Shrimp Stir Fry")));
        onView(withId(R.id.MealCalories)).check(matches(withText("200kcal")));
        onView(withId(R.id.mealFat)).check(matches(withText("4.2g")));
        onView(withId(R.id.mealSaturatedFat)).check(matches(withText("1.5g")));
        onView(withId(R.id.mealCarbohydrates)).check(matches(withText("19.8g")));
        onView(withId(R.id.mealFiber)).check(matches(withText("2.3g")));
        onView(withId(R.id.mealSugar)).check(matches(withText("9.4g")));
        onView(withId(R.id.mealProtein)).check(matches(withText("22.4g")));
        onView(withId(R.id.mealAllergy)).check(matches(withText("Sea Food")));
    }

    @Test
    public void mealOption5Test() {

        // Press button to navigate to Meals page
        onView(withId(R.id.button_meals)).perform(click());

        // Press button to navigate to Meal Option 1 page
        onView(withId(R.id.mealOption5)).perform(click());

        // Ensure that Meal options are displayed
        onView(withId(R.id.MealOptionName)).check(matches(withText("Southwestern Quinoa Salad")));
        onView(withId(R.id.MealCalories)).check(matches(withText("456kcal")));
        onView(withId(R.id.mealFat)).check(matches(withText("23g")));
        onView(withId(R.id.mealSaturatedFat)).check(matches(withText("10g")));
        onView(withId(R.id.mealCarbohydrates)).check(matches(withText("53g")));
        onView(withId(R.id.mealFiber)).check(matches(withText("11g")));
        onView(withId(R.id.mealSugar)).check(matches(withText("5g")));
        onView(withId(R.id.mealProtein)).check(matches(withText("11g")));
        onView(withId(R.id.mealAllergy)).check(matches(withText("None")));
    }

    @Test
    public void mealOption6Test() {

        // Press button to navigate to Meals page
        onView(withId(R.id.button_meals)).perform(click());

        // Press button to navigate to Meal Option 1 page
        onView(withId(R.id.mealOption6)).perform(click());

        // Ensure that Meal options are displayed
        onView(withId(R.id.MealOptionName)).check(matches(withText("Pineapple Salmon")));
        onView(withId(R.id.MealCalories)).check(matches(withText("440kcal")));
        onView(withId(R.id.mealFat)).check(matches(withText("24g")));
        onView(withId(R.id.mealSaturatedFat)).check(matches(withText("3g")));
        onView(withId(R.id.mealCarbohydrates)).check(matches(withText("18g")));
        onView(withId(R.id.mealFiber)).check(matches(withText("2g")));
        onView(withId(R.id.mealSugar)).check(matches(withText("11g")));
        onView(withId(R.id.mealProtein)).check(matches(withText("35g")));
        onView(withId(R.id.mealAllergy)).check(matches(withText("Sea Food")));
    }

    @Test
    public void mealOption7Test() {

        // Press button to navigate to Meals page
        onView(withId(R.id.button_meals)).perform(click());

        // Press button to navigate to Meal Option 1 page
        onView(withId(R.id.mealOption7)).perform(click());

        // Ensure that Meal options are displayed
        onView(withId(R.id.MealOptionName)).check(matches(withText("Sweet and Sour Cauliflower")));
        onView(withId(R.id.MealCalories)).check(matches(withText("566kcal")));
        onView(withId(R.id.mealFat)).check(matches(withText("21g")));
        onView(withId(R.id.mealSaturatedFat)).check(matches(withText("10g")));
        onView(withId(R.id.mealCarbohydrates)).check(matches(withText("55.5g")));
        onView(withId(R.id.mealFiber)).check(matches(withText("18g")));
        onView(withId(R.id.mealSugar)).check(matches(withText("36g")));
        onView(withId(R.id.mealProtein)).check(matches(withText("10g")));
        onView(withId(R.id.mealAllergy)).check(matches(withText("None")));
    }

    @Test
    public void mealOption8Test() {

        // Press button to navigate to Meals page
        onView(withId(R.id.button_meals)).perform(click());

        // Press button to navigate to Meal Option 1 page
        onView(withId(R.id.mealOption8)).perform(click());

        // Ensure that Meal options are displayed
        onView(withId(R.id.MealOptionName)).check(matches(withText("Taco Stuffed Sweet Potato")));
        onView(withId(R.id.MealCalories)).check(matches(withText("493kcal")));
        onView(withId(R.id.mealFat)).check(matches(withText("6g")));
        onView(withId(R.id.mealSaturatedFat)).check(matches(withText("3g")));
        onView(withId(R.id.mealCarbohydrates)).check(matches(withText("80g")));
        onView(withId(R.id.mealFiber)).check(matches(withText("13g")));
        onView(withId(R.id.mealSugar)).check(matches(withText("19g")));
        onView(withId(R.id.mealProtein)).check(matches(withText("31g")));
        onView(withId(R.id.mealAllergy)).check(matches(withText("Dairy")));
    }

    @Test
    public void mealSelectionTest() {

        // Press button to navigate to Meals page
        onView(withId(R.id.button_meals)).perform(click());

        // Add meal option 1
        onView(withId(R.id.mealOption1)).perform(click());
        onView(withId(R.id.AddMealOptionOne)).perform(click());
        Espresso.pressBack();

        // Add meal option 2
        onView(withId(R.id.mealOption2)).perform(click());
        onView(withId(R.id.AddMealOptionTwo)).perform(click());
        Espresso.pressBack();

        // Add meal option 3
        onView(withId(R.id.mealOption3)).perform(click());
        onView(withId(R.id.AddMealOptionThree)).perform(click());
        Espresso.pressBack();

        // Add meal option 4
        onView(withId(R.id.mealOption4)).perform(click());
        onView(withId(R.id.AddMealOptionFour)).perform(click());
        Espresso.pressBack();

        // Add meal option 5
        onView(withId(R.id.mealOption5)).perform(click());
        onView(withId(R.id.AddMealOptionFive)).perform(click());
        Espresso.pressBack();

        // Add meal option 6
        onView(withId(R.id.mealOption6)).perform(click());
        onView(withId(R.id.AddMealOptionSix)).perform(click());
        Espresso.pressBack();

        // Add meal option 7
        onView(withId(R.id.mealOption7)).perform(click());
        onView(withId(R.id.AddMealOptionSeven)).perform(click());
        Espresso.pressBack();

        // Add meal option 8
        onView(withId(R.id.mealOption8)).perform(click());
        onView(withId(R.id.AddMealOptionEight)).perform(click());
        Espresso.pressBack();

        // Navigate back to Welcome page
        Espresso.pressBack();

        // Press button to navigate to Plans page
        onView(withId(R.id.button_plans)).perform(click());

        // Ensure that Plans page option buttons are displayed
        onView(withId(R.id.servingSize)).check(matches(withText("Servings per Meal")));
        onView(withId(R.id.pricePerServing)).check(matches(withText("Each Serving Cost $7.99")));
        onView(withId(R.id.totalCost)).check(matches(withText("Total Cost")));
        onView(withId(R.id.costs)).check(matches(withText("$0.00")));

        // Press button to indicate 2 servings
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.costs)).check(matches(withText("$127.84")));

        // Press button to indicate 4 servings
        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.costs)).check(matches(withText("$255.68")));

        // Navigate back to Welcome page
        Espresso.pressBack();

        // Press button to navigate to Meals page
        onView(withId(R.id.button_meals)).perform(click());

        // Remove meal option 1
        onView(withId(R.id.mealOption1)).perform(click());
        onView(withId(R.id.AddMealOptionOne)).perform(click());
        onView(withId(R.id.AddMealOptionOne)).perform(click());
        Espresso.pressBack();

        // Remove meal option 2
        onView(withId(R.id.mealOption2)).perform(click());
        onView(withId(R.id.AddMealOptionTwo)).perform(click());
        onView(withId(R.id.AddMealOptionTwo)).perform(click());
        Espresso.pressBack();

        // Remove meal option 3
        onView(withId(R.id.mealOption3)).perform(click());
        onView(withId(R.id.AddMealOptionThree)).perform(click());
        onView(withId(R.id.AddMealOptionThree)).perform(click());
        Espresso.pressBack();

        // Remove meal option 4
        onView(withId(R.id.mealOption4)).perform(click());
        onView(withId(R.id.AddMealOptionFour)).perform(click());
        onView(withId(R.id.AddMealOptionFour)).perform(click());
        Espresso.pressBack();

        // Remove meal option 5
        onView(withId(R.id.mealOption5)).perform(click());
        onView(withId(R.id.AddMealOptionFive)).perform(click());
        onView(withId(R.id.AddMealOptionFive)).perform(click());
        Espresso.pressBack();

        // Remove meal option 6
        onView(withId(R.id.mealOption6)).perform(click());
        onView(withId(R.id.AddMealOptionSix)).perform(click());
        onView(withId(R.id.AddMealOptionSix)).perform(click());
        Espresso.pressBack();

        // Remove meal option 7
        onView(withId(R.id.mealOption7)).perform(click());
        onView(withId(R.id.AddMealOptionSeven)).perform(click());
        onView(withId(R.id.AddMealOptionSeven)).perform(click());
        Espresso.pressBack();

        // Remove meal option 8
        onView(withId(R.id.mealOption8)).perform(click());
        onView(withId(R.id.AddMealOptionEight)).perform(click());
        onView(withId(R.id.AddMealOptionEight)).perform(click());
        Espresso.pressBack();

        // Navigate back to Welcome page
        Espresso.pressBack();

        // Press button to navigate to Plans page
        onView(withId(R.id.button_plans)).perform(click());

        // Ensure that Plans page option buttons are displayed
        onView(withId(R.id.servingSize)).check(matches(withText("Servings per Meal")));
        onView(withId(R.id.pricePerServing)).check(matches(withText("Each Serving Cost $7.99")));
        onView(withId(R.id.totalCost)).check(matches(withText("Total Cost")));
        onView(withId(R.id.costs)).check(matches(withText("$0.00")));

        // Press button to indicate 2 servings
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.costs)).check(matches(withText("$0.0")));

        // Press button to indicate 4 servings
        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.costs)).check(matches(withText("$0.0")));
    }

    @Test
    public void setFeedbackTest() {

        // Press button to navigate to Settings page
        onView(withId(R.id.button_settings)).perform(click());

        // Press button to navigate to Feedback page
        onView(withId(R.id.giveFeedback)).perform(click());

        // Click feedback category option
        onView(withText("What category would you like to leave feedback on?")).perform(click());

        // Ensure new feedback category dialog is displayed
        onView(withId(2131296358)).check(matches(withText("What category would you like to leave feedback on?")));
    }

    @Test
    public void setFeedbackTest2() {

        // Press button to navigate to Settings page
        onView(withId(R.id.button_settings)).perform(click());

        // Press button to navigate to Feedback page
        onView(withId(R.id.giveFeedback)).perform(click());

        // Click feedback option
        onView(withText("Overall how are we performing?")).perform(click());

        // Ensure feedback dialog is displayed
        onView(withId(2131296358)).check(matches(withText("Overall how are we performing?")));
    }

    @Test
    public void setFeedbackTest3() {

        // Press button to navigate to Settings page
        onView(withId(R.id.button_settings)).perform(click());

        // Press button to navigate to Feedback page
        onView(withId(R.id.giveFeedback)).perform(click());

        // Click additional feedback option
        onView(withText("Please tell us more")).perform(click());

        // Ensure additional feedback dialog is displayed
        onView(withId(2131296358)).check(matches(withText("Please tell us more")));
    }

    @Test
    public void termsAndConditionsTest() {

        // Press button to navigate to Settings page
        onView(withId(R.id.button_settings)).perform(click());

        // Press button to navigate to Feedback page
        onView(withId(R.id.termsAndConditions)).perform(click());

        // Click additional feedback option
        onView(withText("Terms and Conditions")).perform(click());

        // Ensure terms and conditions slider is displayed
        onView(withId(2131296606)).check(matches(isDisplayed()));
    }

    @Test
    public void registerLoginTest() {

        Random rand = new Random();
        int num = rand.nextInt(1000);
        String username = "TestUser" + num;
        String email = "TestUser" + num + "@test.com";

        // Press button to navigate to Settings page
        onView(withId(R.id.button_settings)).perform(click());

        // Press button to navigate to Login page
        onView(withId(R.id.button_login)).perform(click());

        // Click link to Register page
        onView(withId(R.id.textViewLinkRegister)).perform(click());

        // Fill in registration form
        onView(withId(R.id.textInputEditTextName)).perform(typeText(username));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.textInputEditTextEmail)).perform(typeText(email));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.textInputEditTextAddress)).perform(typeText("123 Pleasant St."));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.textInputEditTextCity)).perform(typeText("Grand Rapids"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.textInputEditTextState)).perform(typeText("MI"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.textInputEditTextZipcode)).perform(typeText("49504"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.textInputEditTextPassword)).perform(typeText("testPassword"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.textInputEditTextConfirmPassword)).perform(typeText("testPassword"));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.textInputEditTextConfirmPassword)).perform(ViewActions.swipeUp());
        Espresso.onView(withId(R.id.textInputEditTextConfirmPassword)).perform(ViewActions.swipeUp());
        Espresso.onView(withId(R.id.textInputEditTextConfirmPassword)).perform(ViewActions.swipeUp());

        // Submit
        onView(withId(R.id.appCompatButtonRegister)).perform(click());

        // Navigate back to Login page and log in
        Espresso.onView(withId(R.id.textInputEditTextConfirmPassword)).perform(ViewActions.swipeUp());
        Espresso.onView(withId(R.id.textInputEditTextConfirmPassword)).perform(ViewActions.swipeUp());
        Espresso.onView(withId(R.id.textInputEditTextConfirmPassword)).perform(ViewActions.swipeUp());
        onView(withId(R.id.appCompatTextViewLoginLink)).perform(click());
        onView(withId(R.id.textInputEditTextEmail)).perform(typeText(email));
        onView(withId(R.id.textInputEditTextPassword)).perform(typeText("testPassword"));
        onView(withId(R.id.appCompatButtonLogin)).perform(click());

        // Ensure that Settings page option buttons are displayed
        onView(withId(R.id.textView)).check(matches(withText("Settings")));
        onView(withId(R.id.button_login)).check(matches(withText("Login/Register                                            >")));
        onView(withId(R.id.termsAndConditions)).check(matches(withText("Terms and Conditions                               >")));
        onView(withId(R.id.giveFeedback)).check(matches(withText("Feedback                                                      >")));

        // Press button to navigate to Login page
        onView(withId(R.id.button_login)).perform(click());

        // Click link to Register page
        onView(withId(R.id.textViewLinkRegister)).perform(click());

        // Fill in registration form
        onView(withId(R.id.textInputEditTextName)).perform(typeText(username));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.textInputEditTextEmail)).perform(typeText(email));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.textInputEditTextAddress)).perform(typeText("123 Pleasant St."));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.textInputEditTextCity)).perform(typeText("Grand Rapids"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.textInputEditTextState)).perform(typeText("MI"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.textInputEditTextZipcode)).perform(typeText("49504"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.textInputEditTextPassword)).perform(typeText("testPassword2"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.textInputEditTextConfirmPassword)).perform(typeText("testPassword2"));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.textInputEditTextConfirmPassword)).perform(ViewActions.swipeUp());
        Espresso.onView(withId(R.id.textInputEditTextConfirmPassword)).perform(ViewActions.swipeUp());
        Espresso.onView(withId(R.id.textInputEditTextConfirmPassword)).perform(ViewActions.swipeUp());

        // Submit
        onView(withId(R.id.appCompatButtonRegister)).perform(click());

        // Navigate back to Login page and log in
        Espresso.onView(withId(R.id.textInputEditTextConfirmPassword)).perform(ViewActions.swipeUp());
        Espresso.onView(withId(R.id.textInputEditTextConfirmPassword)).perform(ViewActions.swipeUp());
        Espresso.onView(withId(R.id.textInputEditTextConfirmPassword)).perform(ViewActions.swipeUp());
        onView(withId(R.id.appCompatTextViewLoginLink)).perform(click());
        onView(withId(R.id.textInputEditTextEmail)).perform(typeText(email));
        onView(withId(R.id.textInputEditTextPassword)).perform(typeText("testPassword2"));
        onView(withId(R.id.appCompatButtonLogin)).perform(click());

        // Ensure that Login page is still displayed
        onView(withId(R.id.appCompatButtonLogin)).check(matches(withText("Login")));

    }

    @Test
    public void registerLoginTestInputValidation() {

        Random rand = new Random();
        int num = rand.nextInt(1000);
        String username = "TestUser" + num;
        String email = "TestUser" + num;

        // Press button to navigate to Settings page
        onView(withId(R.id.button_settings)).perform(click());

        // Press button to navigate to Login page
        onView(withId(R.id.button_login)).perform(click());

        // Click link to Register page
        onView(withId(R.id.textViewLinkRegister)).perform(click());

        // Fill in registration form
        onView(withId(R.id.textInputEditTextName)).perform(typeText(username));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.textInputEditTextEmail)).perform(typeText(email));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.textInputEditTextAddress)).perform(typeText("123 Pleasant St."));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.textInputEditTextCity)).perform(typeText("Grand Rapids"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.textInputEditTextState)).perform(typeText("MI"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.textInputEditTextZipcode)).perform(typeText("49504"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.textInputEditTextPassword)).perform(typeText("testPassword"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.textInputEditTextConfirmPassword)).perform(typeText("testPassword"));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.textInputEditTextConfirmPassword)).perform(ViewActions.swipeUp());
        Espresso.onView(withId(R.id.textInputEditTextConfirmPassword)).perform(ViewActions.swipeUp());
        Espresso.onView(withId(R.id.textInputEditTextConfirmPassword)).perform(ViewActions.swipeUp());

        // Submit
        onView(withId(R.id.appCompatButtonRegister)).perform(click());

        // Navigate back to Login page and log in
        Espresso.onView(withId(R.id.textInputEditTextConfirmPassword)).perform(ViewActions.swipeUp());
        Espresso.onView(withId(R.id.textInputEditTextConfirmPassword)).perform(ViewActions.swipeUp());
        Espresso.onView(withId(R.id.textInputEditTextConfirmPassword)).perform(ViewActions.swipeUp());
        onView(withId(R.id.appCompatTextViewLoginLink)).perform(click());
        onView(withId(R.id.textInputEditTextEmail)).perform(typeText(email));
        onView(withId(R.id.textInputEditTextPassword)).perform(typeText("testPassword"));
        onView(withId(R.id.appCompatButtonLogin)).perform(click());

        // Ensure that Settings page option buttons are displayed
        onView(withId(R.id.textView)).check(matches(withText("Settings")));
        onView(withId(R.id.button_login)).check(matches(withText("Login/Register                                            >")));
        onView(withId(R.id.termsAndConditions)).check(matches(withText("Terms and Conditions                               >")));
        onView(withId(R.id.giveFeedback)).check(matches(withText("Feedback                                                      >")));

        // Press button to navigate to Login page
        onView(withId(R.id.button_login)).perform(click());

        // Click link to Register page
        onView(withId(R.id.textViewLinkRegister)).perform(click());

        // Fill in registration form
        onView(withId(R.id.textInputEditTextName)).perform(typeText(username));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.textInputEditTextEmail)).perform(typeText(email));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.textInputEditTextAddress)).perform(typeText("123 Pleasant St."));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.textInputEditTextCity)).perform(typeText("Grand Rapids"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.textInputEditTextState)).perform(typeText("MI"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.textInputEditTextZipcode)).perform(typeText("49504"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.textInputEditTextPassword)).perform(typeText("testPassword2"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.textInputEditTextConfirmPassword)).perform(typeText("testPassword2"));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.textInputEditTextConfirmPassword)).perform(ViewActions.swipeUp());
        Espresso.onView(withId(R.id.textInputEditTextConfirmPassword)).perform(ViewActions.swipeUp());
        Espresso.onView(withId(R.id.textInputEditTextConfirmPassword)).perform(ViewActions.swipeUp());

        // Submit
        onView(withId(R.id.appCompatButtonRegister)).perform(click());

        // Navigate back to Login page and log in
        Espresso.onView(withId(R.id.textInputEditTextConfirmPassword)).perform(ViewActions.swipeUp());
        Espresso.onView(withId(R.id.textInputEditTextConfirmPassword)).perform(ViewActions.swipeUp());
        Espresso.onView(withId(R.id.textInputEditTextConfirmPassword)).perform(ViewActions.swipeUp());
        onView(withId(R.id.appCompatTextViewLoginLink)).perform(click());
        onView(withId(R.id.textInputEditTextEmail)).perform(typeText(email));
        onView(withId(R.id.textInputEditTextPassword)).perform(typeText("testPassword2"));
        onView(withId(R.id.appCompatButtonLogin)).perform(click());

        // Ensure that Login page is still displayed
        onView(withId(R.id.appCompatButtonLogin)).check(matches(withText("Login")));

    }

}
