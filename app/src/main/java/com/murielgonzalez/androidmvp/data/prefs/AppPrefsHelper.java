package com.murielgonzalez.androidmvp.data.prefs;

import android.content.Context;
import android.content.SharedPreferences;

import com.murielgonzalez.androidmvp.di.ApplicationContext;
import com.murielgonzalez.androidmvp.di.PreferenceInfo;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by muriel_gonzalez on 2/21/18.
 */
@Singleton
public class AppPrefsHelper implements PrefsHelper {

    private static final String PREF_KEY_CURRENT_USER_NAME = "PREF_KEY_CURRENT_USER_NAME";

    private final SharedPreferences mPrefs;

    @Inject
    public AppPrefsHelper(@ApplicationContext Context context, @PreferenceInfo String prefFileName) {
        mPrefs = context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE);
    }

    @Override
    public void setCurrentUserName(String userName) {
        mPrefs.edit().putString(PREF_KEY_CURRENT_USER_NAME, userName).apply();
    }
}
