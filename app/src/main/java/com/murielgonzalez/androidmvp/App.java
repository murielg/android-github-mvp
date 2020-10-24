package com.murielgonzalez.androidmvp;

/**
 * Created by muriel_gonzalez on 2/20/18.
 */

import com.murielgonzalez.androidmvp.data.AppRepository;
import com.murielgonzalez.androidmvp.di.DaggerApplicationComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class App extends DaggerApplication {

    @Inject
    AppRepository mAppRepository;


    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerApplicationComponent.builder().application(this).build();
    }
}
