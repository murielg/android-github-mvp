package com.murielgonzalez.androidmvp.di.application;

import android.app.Application;

import com.murielgonzalez.androidmvp.data.AppDataStore;
import com.murielgonzalez.androidmvp.data.api.AppInterface;
import com.murielgonzalez.androidmvp.data.remote.AppRemoteDataStore;
import com.murielgonzalez.androidmvp.di.scopes.Remote;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by muriel_gonzalez on 2/21/18.
 */

@Module
public class ApplicationModule {

    @Singleton
    @Provides
    @Remote
    AppDataStore provideAppRemoteDataStore(AppInterface appInterface) {
        return new AppRemoteDataStore(appInterface);
    }

}
