package com.murielgonzalez.androidmvp;

/**
 * Created by muriel_gonzalez on 2/20/18.
 */


import android.app.Application;


import com.murielgonzalez.androidmvp.data.DataManager;
import com.murielgonzalez.androidmvp.di.components.ApplicationComponent;
//import com.murielgonzalez.androidmvp.di.components.DaggerApplicationComponent;
import com.murielgonzalez.androidmvp.di.modules.ApplicationModule;

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
//        mApplicationComponent = DaggerApplicationComponent.builder()
//                .applicationModule(new ApplicationModule(this)).build();
//
//        mApplicationComponent.inject(this);


    }

    public ApplicationComponent getComponent() {
        return mApplicationComponent;
    }

}
