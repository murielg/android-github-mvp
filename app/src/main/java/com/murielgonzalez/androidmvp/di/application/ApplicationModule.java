package com.murielgonzalez.androidmvp.di.application;

import com.murielgonzalez.androidmvp.data.AppDataSource;
import com.murielgonzalez.androidmvp.data.api.AppInterface;
import com.murielgonzalez.androidmvp.data.remote.AppRemoteDataSource;
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
    AppDataSource provideAppRemoteDataSource(AppInterface appInterface) {
        return new AppRemoteDataSource(appInterface);
    }

}
