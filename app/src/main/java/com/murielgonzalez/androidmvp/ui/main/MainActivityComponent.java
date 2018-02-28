package com.murielgonzalez.androidmvp.ui.main;

import com.murielgonzalez.androidmvp.di.application.ApplicationComponent;
import com.murielgonzalez.androidmvp.di.repository.AppRepositoryComponent;
import com.murielgonzalez.androidmvp.di.scopes.ActivityScope;

import dagger.Component;

/**
 * Created by muriel_gonzalez on 2/28/18.
 */
@ActivityScope
@Component(dependencies = ApplicationComponent.class, modules = MainActivityModule.class)
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
