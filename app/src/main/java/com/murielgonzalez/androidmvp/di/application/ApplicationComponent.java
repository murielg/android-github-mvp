package com.murielgonzalez.androidmvp.di.application;

import android.app.Application;

import com.murielgonzalez.androidmvp.App;
import com.murielgonzalez.androidmvp.data.AppRepository;
import com.murielgonzalez.androidmvp.di.ActivityBindingModule;
import com.murielgonzalez.androidmvp.di.repository.AppRepositoryModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by muriel_gonzalez on 2/20/18.
 */

/**
 * This is a Dagger component. Refer to {@link App} for the list of Dagger components
 * used in this application.
 * <p>
 * Even though Dagger allows annotating a {@link Component} as a singleton, the code
 * itself must ensure only one instance of the class is created. This is done in {@link
 * App}.
 * //{@link AndroidSupportInjectionModule}
 * // is the module from Dagger.Android that helps with the generation
 * // and location of subcomponents.
 */

@Singleton
@Component(modules = {
    AppRepositoryModule.class,
    ApplicationModule.class,
    ActivityBindingModule.class,
    AndroidSupportInjectionModule.class
})
public interface ApplicationComponent extends AndroidInjector<App> {

    AppRepository getAppRepository();

    @Component.Builder
    interface Builder {
        @BindsInstance
        ApplicationComponent.Builder application(Application application);

        ApplicationComponent build();
    }


}
