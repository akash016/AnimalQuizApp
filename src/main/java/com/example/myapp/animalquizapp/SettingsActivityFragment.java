package com.example.myapp.animalquizapp;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.example.mortezasaadat.animalquiz.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class SettingsActivityFragment extends PreferenceFragment {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.quiz_preferences);

    }


}
