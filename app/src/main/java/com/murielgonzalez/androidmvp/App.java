package com.murielgonzalez.androidmvp;

/**
 * Created by muriel_gonzalez on 2/20/18.
 */

import android.app.Application;
import com.murielgonzalez.androidmvp.di.application.DaggerApplicationComponent;
import com.murielgonzalez.androidmvp.di.application.ApplicationComponent;
import com.murielgonzalez.androidmvp.di.repository.AppRepositoryModule;

public class App extends Application {

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        this.initializeAppComponent();
    }

    protected void initializeAppComponent() {
        mApplicationComponent = DaggerApplicationComponent.builder()
            .appRepositoryModule(new AppRepositoryModule((App) getApplicationContext()))
            .build();
    }

    public ApplicationComponent getComponent() {
        return mApplicationComponent;
    }


}
