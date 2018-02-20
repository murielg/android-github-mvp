package com.murielgonzalez.androidmvp.data;

import android.content.Context;

import com.murielgonzalez.androidmvp.di.ApplicationContext;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by muriel_gonzalez on 2/20/18.
 */

@Singleton
public class AppDataManager implements DataManager {
    private static final String TAG = AppDataManager.class.getSimpleName();

    private final Context mContext;
    @Inject
    public AppDataManager(@ApplicationContext Context context) {
        mContext = context;
    }

}
