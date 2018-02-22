package com.murielgonzalez.androidmvp.data.prefs;

import android.content.Context;
import android.content.SharedPreferences;

import com.murielgonzalez.androidmvp.di.ApplicationContext;
import com.murielgonzalez.androidmvp.di.PreferenceInfo;

import javax.inject.Inject;

/**
 * Created by muriel_gonzalez on 2/21/18.
 */

public class AppPrefsHelper implements PrefsHelper {

    private final SharedPreferences mSharedPreferences;
    @Inject
    public AppPrefsHelper(@ApplicationContext Context context, @PreferenceInfo String prefFileName) {
        mSharedPreferences = context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE);
    }
}
