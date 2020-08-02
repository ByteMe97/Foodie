package com.example.myfirstapp;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that allows the user to chose which meal plan to purchase
 */
public class PlansPage extends Fragment {

    private List<String> meals = new ArrayList<String>();
    private double cost;
    private int listSize;
    private TextView finalCost;


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

        return inflater.inflate(R.layout.plans_page, container, false);
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

        meals = PrefConfig.readListFromPref(getContext());
        listSize = PrefConfig.determineSizeOfList(getContext());
        finalCost = (TextView) view.findViewById(R.id.costs);

        view.findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateDisplay(2);
            }
        });
        view.findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateDisplay(4);
            }
        });

        ListView listView = (ListView) view.findViewById(R.id.chosenMeals);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),
                R.layout.activity_listview, meals);
        listView.setAdapter(adapter);
    }

    /**
     * Method used to update the total cost of the meals shown to the user
     * @param servingSize  How many serving of each meal the user requested
     */
    public void updateDisplay(int servingSize){
        cost = listSize * 7.99 * servingSize;
        finalCost.setText("$" + cost);
    }

}