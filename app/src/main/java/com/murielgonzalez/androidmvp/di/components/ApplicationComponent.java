package com.murielgonzalez.androidmvp.di.components;

import com.murielgonzalez.androidmvp.data.remote.AppRemoteDataStore;
import com.murielgonzalez.androidmvp.di.modules.ApplicationModule;
import com.murielgonzalez.androidmvp.di.modules.DataModule;
import com.murielgonzalez.androidmvp.ui.main.MainActivity;
import com.murielgonzalez.androidmvp.ui.main.MainActivityFragment;

import javax.inject.Singleton;
import dagger.Component;

/**
 * Created by muriel_gonzalez on 2/20/18.
 */

// Component is used to connect objects to their dependencies.
@Singleton
@Component(modules = {ApplicationModule.class, DataModule.class})
public interface ApplicationComponent {

    void inject(MainActivity activity);

    void inject(AppRemoteDataStore appRemoteDataStore);

}
