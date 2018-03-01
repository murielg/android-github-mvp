package com.murielgonzalez.androidmvp.di.application;

import android.app.Application;
import android.content.Context;

import com.murielgonzalez.androidmvp.data.AppDataSource;
import com.murielgonzalez.androidmvp.data.api.AppInterface;
import com.murielgonzalez.androidmvp.data.remote.AppRemoteDataSource;
import com.murielgonzalez.androidmvp.di.scopes.Remote;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by muriel_gonzalez on 2/21/18.
 */


/**
 * This is a Dagger module. We use this to bind our Application class as a Context in the AppComponent
 * By using Dagger Android we do not need to pass our Application instance to any module,
 * we simply need to expose our Application as Context.
 * One of the advantages of Dagger.Android is that your
 * Application & Activities are provided into your graph for you.
 * {@link
 * ApplicationComponent}.
 */
@Module
public abstract class ApplicationModule {

//
    @Binds
    abstract Context bindContext(Application application);

}
