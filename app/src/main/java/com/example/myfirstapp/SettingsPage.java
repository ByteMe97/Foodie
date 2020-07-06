package com.example.myfirstapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SettingsPage extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.settings, container, false);
    }
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        view.findViewById(R.id.personal_info).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SettingsPage.this)
                        .navigate(R.id.action_SettingsPage_to_PersonalSettingsPage);
            }
        });

        view.findViewById(R.id.password).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SettingsPage.this)
                        .navigate(R.id.action_SettingsPage_to_PasswordSettingsPage);
            }
        });

        view.findViewById(R.id.email).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SettingsPage.this)
                        .navigate(R.id.action_SettingsPage_to_EmailSettingsPage);
            }
        });

        view.findViewById(R.id.giveFeedback).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SettingsPage.this)
                        .navigate(R.id.action_SettingsPage_to_FeedbackSettingsPage);
            }
        });

        view.findViewById(R.id.termsAndConditions).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SettingsPage.this)
                        .navigate(R.id.action_SettingsPage_to_termsAndConditions);
            }
        });
    }

}