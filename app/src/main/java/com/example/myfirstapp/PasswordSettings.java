package com.example.myfirstapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.PreferenceFragmentCompat;


/**
 * Class used to change the users password
 */
public class PasswordSettings extends PreferenceFragmentCompat {


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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        view.setBackgroundColor(getResources().getColor(R.color.white));

        return view;
    }


    /**
     * Called to supply the preferences for the fragment
     * @param savedInstanceState    if the fragment is being re-created from a previous saved state,
     *                              this is the state.
     *
     * @param rootKey               if non-null, this preference fragment should be rooted at the
     *                              PreferenceScreen with this key.
     */
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.password_preferences, rootKey);
    }

}