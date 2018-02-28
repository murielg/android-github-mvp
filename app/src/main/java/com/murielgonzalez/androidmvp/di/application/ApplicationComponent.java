package com.murielgonzalez.androidmvp.di.application;

import com.murielgonzalez.androidmvp.data.AppRepository;
import com.murielgonzalez.androidmvp.di.repository.AppRepositoryModule;

import javax.inject.Singleton;
import dagger.Component;

/**
 * Created by muriel_gonzalez on 2/20/18.
 */

@Singleton
@Component(modules = {ApplicationModule.class, AppRepositoryModule.class})
public interface ApplicationComponent {

    AppRepository getAppRepository();


}
