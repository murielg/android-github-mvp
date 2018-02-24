package com.murielgonzalez.androidmvp.data;

import com.murielgonzalez.androidmvp.di.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by muriel_gonzalez on 2/24/18.
 */

@Singleton
@Component(modules = {AppDataManagerModule.class, ApplicationModule.class})
public interface AppDataManagerComponent {

  DataManager getDataManager();

}
