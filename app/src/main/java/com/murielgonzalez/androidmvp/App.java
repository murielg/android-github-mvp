package com.murielgonzalez.androidmvp;

/**
 * Created by muriel_gonzalez on 2/20/18.
 */

import android.app.Application;

import com.murielgonzalez.androidmvp.di.components.ApplicationComponent;
import com.murielgonzalez.androidmvp.di.components.DaggerApplicationComponent;
import com.murielgonzalez.androidmvp.di.modules.ApplicationModule;

public class App extends Application {

    private ApplicationComponent mApplicationComponent;

//    @Inject
//    DataManager mDataManager;

    @Override
    public void onCreate() {
        super.onCreate();
        this.initializeAppComponent();
    }


    protected void initializeAppComponent() {
        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();
        mApplicationComponent.inject(this);

    }

    public ApplicationComponent getComponent() {
        return mApplicationComponent;
    }

}
