package com.murielgonzalez.androidmvp.di.components;

import com.murielgonzalez.androidmvp.App;
import com.murielgonzalez.androidmvp.di.modules.ActivityBindingModule;
import com.murielgonzalez.androidmvp.di.modules.ApplicationModule;

import javax.inject.Singleton;
import dagger.BindsInstance;
import dagger.Component;

/**
 * Created by muriel_gonzalez on 2/20/18.
 */

// Component is used to connect objects to their dependencies.
@Singleton
@Component(modules = {
    ApplicationModule.class,
    ActivityBindingModule.class
})
public interface ApplicationComponent {

//    void inject(App app);
//
//    // Exposed to sub-graphs
//    DataManager getDataManager();
//
//    @ApplicationContext
//    Context context();
//
//    Application application();
    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(App app);
        ApplicationComponent build();
    }

    void inject(App app);

}
