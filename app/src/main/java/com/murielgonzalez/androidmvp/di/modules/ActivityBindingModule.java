package com.murielgonzalez.androidmvp.di.modules;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.murielgonzalez.androidmvp.di.ActivityContext;
import com.murielgonzalez.androidmvp.di.ActivityScoped;
import com.murielgonzalez.androidmvp.di.PerActivity;
import com.murielgonzalez.androidmvp.ui.main.MainActivity;
import com.murielgonzalez.androidmvp.ui.main.MainActivityModule;
import com.murielgonzalez.androidmvp.ui.main.MainActivityPresenter;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by muriel_gonzalez on 2/21/18.
 */
// This module exposes the activity to dependents in the graph.
// Dagger will create a subcomponent that will have a parent of ApplicationComponent
//
@Module
public abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity mainActivity();

    // Add bindings for other sub-components here

}
