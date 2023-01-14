package io.github.tstewart.materialpreferencesfragment.sample;

import android.os.Bundle;

import androidx.annotation.Nullable;

import io.github.tstewart.materialpreferencesfragment.MaterialPreferencesFragment;
import io.github.tstewart.materialpreferencesfragment.R;

public class GeneralPreferenceFragment extends MaterialPreferencesFragment {
    @Override
    public void onCreatePreferences(@Nullable Bundle savedInstanceState, @Nullable String rootKey) {
        setPreferencesFromResource(R.xml.general_preferences, rootKey);
    }
}