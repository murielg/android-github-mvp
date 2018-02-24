package com.murielgonzalez.androidmvp.ui.main;

import com.murielgonzalez.androidmvp.di.ActivityScoped;
import com.murielgonzalez.androidmvp.di.FragmentScoped;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by muriel_gonzalez on 2/24/18.
 */
@Module
public class MainActivityModule {

  private final MainActivityContract.View mView;

  public MainActivityModule(MainActivityContract.View view) {
    mView = view;
  }

  @Provides
  MainActivityContract.View provideMainActivityContractView() {
    return mView;
  }

}
