package com.murielgonzalez.androidmvp.di.components;

import android.app.Application;
import android.content.Context;

import com.murielgonzalez.androidmvp.App;
import com.murielgonzalez.androidmvp.data.DataManager;
import com.murielgonzalez.androidmvp.di.ApplicationContext;
import com.murielgonzalez.androidmvp.di.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by muriel_gonzalez on 2/20/18.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    @ApplicationContext
    Context context();

    Application application();

    DataManager getDataManager();


}
