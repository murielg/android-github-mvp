package com.murielgonzalez.androidmvp.di.components;

import android.app.Application;
import android.content.Context;

import com.murielgonzalez.androidmvp.App;
import com.murielgonzalez.androidmvp.data.DataManager;
import com.murielgonzalez.androidmvp.data.db.DbHelper;
import com.murielgonzalez.androidmvp.di.ApplicationContext;

import javax.inject.Singleton;

/**
 * Created by muriel_gonzalez on 2/20/18.
 */
@Singleton

public interface ApplicationComponent {
    void inject(App app);

    @ApplicationContext
    Context getContext();

    Application getApplication();

    DataManager getDataManager();

    DbHelper getDbHelper();

}
