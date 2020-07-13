package com.example.myfirstapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Class that allows the user to chose which meal plan to purchase
 */
public class PlansPage extends Fragment {


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
            Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.plans_page, container, false);
    }
}