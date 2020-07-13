package com.example.myfirstapp;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;


/**
 * The Main Activity for the Application
 * @author Katie LaBell and Kendra Haan
 * @version 1.0
 * This is the first screen to the user
 */
public class MainActivity extends AppCompatActivity {


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
     * This method is used to add items to the action bar if it is present
     * @param menu  item to add
     *
     * @return       true once code has finished running
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    /**
     * Method that implements handle action bar item clicks
     * @param item item that was selected
     *
     * @return true or false depending on what was selected
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}