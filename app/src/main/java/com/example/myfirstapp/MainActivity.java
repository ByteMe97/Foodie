package com.example.myfirstapp;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;

/**
 * The Main Activity for the Application
 * @author Katie LaBell and Kendra Haan
 * @version 2.0
 * This is the first screen to the user
 */
public class MainActivity extends AppCompatActivity implements MealOptionOne.MealOption1Listener,
        MealOptionTwo.MealOption2Listener, MealOptionThree.MealOption3Listener,
        MealOptionFour.MealOption4Listener, MealOptionFive.MealOption5Listener,
        MealOptionSix.MealOption6Listener, MealOptionSeven.MealOption7Listener,
        MealOptionEight.MealOption8Listener {

    private List<String> meals = new ArrayList<String>();

    /**
     * Constructor used to do initial creation of a fragment
     * @param savedInstanceState    if the fragment is being re-created from a previous saved state,
     *                              this is the state.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv_background = findViewById(R.id.iv_background);
        AnimationDrawable animationDrawable = (AnimationDrawable)  iv_background.getDrawable();
        animationDrawable.start();
    }

    /**
     * Method that is invoked when meal is chosen for the week. Calls on external function to add
     * the selected meal to the current meal listing
     * @param input name of meal to be added
     */
    @Override
    public void onMeal1Chosen(String input) {
        if(!meals.contains(input))
            meals.add(input);
        PrefConfig.writeListInPref(getApplicationContext(), meals);
    }

    /**
     * Method that is invoked when meal is removed from chosen meals.
     * Calls on external function to remove the selected meal to the current meal listing
     * @param input name of meal to be added
     */
    @Override
    public void onMeal1Removed(String input) {
        if(meals.contains(input))
            meals.remove(input);
        PrefConfig.writeListInPref(getApplicationContext(), meals);
    }

    /**
     * Method that is invoked when meal is chosen for the week. Calls on external function to add
     * the selected meal to the current meal listing
     * @param input name of meal to be added
     */
    @Override
    public void onMeal2Chosen(String input) {
        if(!meals.contains(input))
            meals.add(input);
        PrefConfig.writeListInPref(getApplicationContext(), meals);
    }

    /**
     * Method that is invoked when meal is removed from chosen meals.
     * Calls on external function to remove the selected meal to the current meal listing
     * @param input name of meal to be added
     */
    @Override
    public void onMeal2Removed(String input) {
        if(meals.contains(input))
            meals.remove(input);
        PrefConfig.writeListInPref(getApplicationContext(), meals);
    }

    /**
     * Method that is invoked when meal is chosen for the week. Calls on external function to add
     * the selected meal to the current meal listing
     * @param input name of meal to be added
     */
    @Override
    public void onMeal3Chosen(String input) {
        if(!meals.contains(input))
            meals.add(input);
        PrefConfig.writeListInPref(getApplicationContext(), meals);
    }

    /**
     * Method that is invoked when meal is removed from chosen meals.
     * Calls on external function to remove the selected meal to the current meal listing
     * @param input name of meal to be added
     */
    @Override
    public void onMeal3Removed(String input) {
        if(meals.contains(input))
            meals.remove(input);
        PrefConfig.writeListInPref(getApplicationContext(), meals);
    }

    /**
     * Method that is invoked when meal is chosen for the week. Calls on external function to add
     * the selected meal to the current meal listing
     * @param input name of meal to be added
     */
    @Override
    public void onMeal4Chosen(String input) {
        if(!meals.contains(input))
            meals.add(input);
        PrefConfig.writeListInPref(getApplicationContext(), meals);
    }

    /**
     * Method that is invoked when meal is removed from chosen meals.
     * Calls on external function to remove the selected meal to the current meal listing
     * @param input name of meal to be added
     */
    @Override
    public void onMeal4Removed(String input) {
        if(meals.contains(input))
            meals.remove(input);
        PrefConfig.writeListInPref(getApplicationContext(), meals);
    }

    /**
     * Method that is invoked when meal is chosen for the week. Calls on external function to add
     * the selected meal to the current meal listing
     * @param input name of meal to be added
     */
    @Override
    public void onMeal5Chosen(String input) {
        if(!meals.contains(input))
            meals.add(input);
        PrefConfig.writeListInPref(getApplicationContext(), meals);
    }

    /**
     * Method that is invoked when meal is removed from chosen meals.
     * Calls on external function to remove the selected meal to the current meal listing
     * @param input name of meal to be added
     */
    @Override
    public void onMeal5Removed(String input) {
        if(meals.contains(input))
            meals.remove(input);
        PrefConfig.writeListInPref(getApplicationContext(), meals);
    }

    /**
     * Method that is invoked when meal is chosen for the week. Calls on external function to add
     * the selected meal to the current meal listing
     * @param input name of meal to be added
     */
    @Override
    public void onMeal6Chosen(String input) {
        if(!meals.contains(input))
            meals.add(input);
        PrefConfig.writeListInPref(getApplicationContext(), meals);
    }

    /**
     * Method that is invoked when meal is removed from chosen meals.
     * Calls on external function to remove the selected meal to the current meal listing
     * @param input name of meal to be added
     */
    @Override
    public void onMeal6Removed(String input) {
        if(meals.contains(input))
            meals.remove(input);
        PrefConfig.writeListInPref(getApplicationContext(), meals);
    }

    /**
     * Method that is invoked when meal is chosen for the week. Calls on external function to add
     * the selected meal to the current meal listing
     * @param input name of meal to be added
     */
    @Override
    public void onMeal7Chosen(String input) {
        if(!meals.contains(input))
            meals.add(input);
        PrefConfig.writeListInPref(getApplicationContext(), meals);
    }

    /**
     * Method that is invoked when meal is removed from chosen meals.
     * Calls on external function to remove the selected meal to the current meal listing
     * @param input name of meal to be added
     */
    @Override
    public void onMeal7Removed(String input) {
        if(meals.contains(input))
            meals.remove(input);
        PrefConfig.writeListInPref(getApplicationContext(), meals);
    }

    /**
     * Method that is invoked when meal is chosen for the week. Calls on external function to add
     * the selected meal to the current meal listing
     * @param input name of meal to be added
     */
    @Override
    public void onMeal8Chosen(String input) {
        if(!meals.contains(input))
            meals.add(input);
        PrefConfig.writeListInPref(getApplicationContext(), meals);
    }

    /**
     * Method that is invoked when meal is removed from chosen meals.
     * Calls on external function to remove the selected meal to the current meal listing
     * @param input name of meal to be added
     */
    @Override
    public void onMeal8Removed(String input) {
        if(meals.contains(input))
            meals.remove(input);
        PrefConfig.writeListInPref(getApplicationContext(), meals);
    }

}