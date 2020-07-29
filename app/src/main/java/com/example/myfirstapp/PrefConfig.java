package com.example.myfirstapp;


import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.PreferenceManager;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class PrefConfig {

    private static final String LIST_KEY = "list_key";

    public static void writeListInPref(Context context, List<String> list){
        Gson gson = new Gson();
        String jsonString = gson.toJson(list);

        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(LIST_KEY, jsonString);
        editor.apply();
    }

    public static List<String> readListFromPref(Context context){
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        String jsonString = sp.getString(LIST_KEY, "");

        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<String>>(){}.getType();
        List<String> list = gson.fromJson(jsonString, type);
        return list;
    }
}
