package com.example.myfirstapp;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

/**
 * Class used to show sixth meal option
 */
public class MealOptionSix extends Fragment {

    private MealOptionSix.MealOption6Listener listener;
    private Switch sw6;

    /**
     * Called to have the fragment instantiate its user interface view.
     * @param inflater              The LayoutInflater object that can be used to inflate any views
     *                              in the fragment,
     *
     * @param container             if non-null, this is the parent view that the fragment's UI
     *                              should be attached to. The fragment should not add the view
     *                              itself, but this can be used to generate the LayoutParams of
     *                              the view.
     *
     * @param savedInstanceState    if non-null, this fragment is being reconstructed from a
     *                              previous saved state
     *
     * @return view                 returns the view for the fragments UI, or null
     */
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.meal_option_six, container, false);
        view.setBackgroundColor(getResources().getColor(R.color.white));
        return view;

    }


    /**
     * Called immediately after onCreateView(LayoutInflater, ViewGroup, Bundle) has returned, but
     * before any saved state has been restored in to the view. This gives subclasses a chance to
     * initialize themselves once they know their view hierarchy has been completely created. The
     * fragment's view hierarchy is not however attached to its parent at this point.
     * @param view                  view returned by onCreateView
     *
     * @param savedInstanceState    if non-null, this fragment is being re-constructed from a
     *                              previous saved state as given here
     */
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        sw6 = (Switch)view.findViewById(R.id.AddMealOptionSix);
        sw6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    String input = getString(R.string.meal_option_six_name);
                    listener.onMeal6Chosen(input);
                }
                if (!isChecked) {
                    String meal = getString(R.string.meal_option_six_name);
                    listener.onMeal6Removed(meal);
                }
            }
        });
    }

    /**
     * Method used to attach the listener to meal option 8
     * @param context is called when switch is turned on
     */
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof MealOptionSix.MealOption6Listener){
            listener = (MealOptionSix.MealOption6Listener) context;
        }
        else{
            throw new RuntimeException(context.toString() +
                    "must implement MealOption6Listener");
        }
    }

    /**
     * Method that detaches the listener when user exits the page
     */
    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }

    /**
     * Interface used to instantiate a listener
     */
    public interface MealOption6Listener {
        void onMeal6Chosen(String input);
        void onMeal6Removed(String input);
    }
}