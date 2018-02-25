package com.murielgonzalez.androidmvp;

/**
 * Created by muriel_gonzalez on 2/20/18.
 */

import android.app.Application;

import com.murielgonzalez.androidmvp.di.components.ApplicationComponent;
import com.murielgonzalez.androidmvp.di.components.DaggerApplicationComponent;
import com.murielgonzalez.androidmvp.di.modules.ApplicationModule;
import com.murielgonzalez.androidmvp.di.modules.DataModule;

public class App extends Application {

    private static ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        this.initializeAppComponent();
    }


    protected void initializeAppComponent() {
        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
            .dataModule(new DataModule(BuildConfig.BASE_URL))
            .build();
    }

    public static ApplicationComponent getComponent() {
        return mApplicationComponent;
    }

}
