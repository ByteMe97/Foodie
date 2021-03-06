package com.example.myfirstapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;


/**
 * Class used to allow user to pick meals for upcoming week
 */
public class MealsPage extends Fragment {


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
     * @return                     returns the view for the fragments UI, or null
     */
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.meals_page, container, false);
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

        view.findViewById(R.id.mealOption1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MealsPage.this)
                        .navigate(R.id.action_MealsPage_to_MealOption1);
            }
        });

        view.findViewById(R.id.mealOption2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MealsPage.this)
                        .navigate(R.id.action_MealsPage_to_MealOption2);
            }
        });

        view.findViewById(R.id.mealOption3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MealsPage.this)
                        .navigate(R.id.action_MealsPage_to_MealOption3);
            }
        });

        view.findViewById(R.id.mealOption4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MealsPage.this)
                        .navigate(R.id.action_MealsPage_to_MealOption4);
            }
        });

        view.findViewById(R.id.mealOption5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MealsPage.this)
                        .navigate(R.id.action_MealsPage_to_MealOption5);
            }
        });

        view.findViewById(R.id.mealOption6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MealsPage.this)
                        .navigate(R.id.action_MealsPage_to_MealOption6);
            }
        });

        view.findViewById(R.id.mealOption7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MealsPage.this)
                        .navigate(R.id.action_MealsPage_to_MealOption7);
            }
        });

        view.findViewById(R.id.mealOption8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MealsPage.this)
                        .navigate(R.id.action_MealsPage_to_MealOption8);
            }
        });
    }
}