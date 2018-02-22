package com.murielgonzalez.androidmvp;

/**
 * Created by muriel_gonzalez on 2/20/18.
 */


import android.app.Application;
import android.content.Context;

import com.murielgonzalez.androidmvp.data.DataManager;
import com.murielgonzalez.androidmvp.di.components.ApplicationComponent;

import javax.inject.Inject;

public class App extends Application {

    @Inject
    DataManager mDataManager;

    private ApplicationComponent mApplicationComponent;


    @Override
    public void onCreate() {
        super.onCreate();
        this.initializeInjector();
    }


    protected void initializeInjector() {


    }

    public ApplicationComponent getComponent() {
        return mApplicationComponent;
    }

}
