package com.murielgonzalez.androidmvp.di.modules;

import com.murielgonzalez.androidmvp.ui.main.MainActivity;
import com.murielgonzalez.androidmvp.ui.main.MainActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by muriel_gonzalez on 2/21/18.
 */
// This module exposes the activity to dependents in the graph.
// Dagger will create a subcomponent that will have a parent of ApplicationComponent
//
@Module
public abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity mainActivity();

    // Add bindings for other sub-components here

}
