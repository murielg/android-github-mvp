package com.murielgonzalez.androidmvp.ui.main;

import com.murielgonzalez.androidmvp.di.scopes.ActivityScoped;
import com.murielgonzalez.androidmvp.di.scopes.FragmentScoped;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by muriel_gonzalez on 2/24/18.
 */

/**
 * This is a Dagger module. We use this to pass in the View dependency to the
 * {@link MainActivityPresenter}.
 */

@Module
public abstract class MainActivityModule {

  @FragmentScoped
  @ContributesAndroidInjector
  abstract MainActivityFragment mMainActivityFragment();

  @ActivityScoped
  @Binds abstract MainActivityContract.Presenter mPresenter(MainActivityPresenter presenter);

}

