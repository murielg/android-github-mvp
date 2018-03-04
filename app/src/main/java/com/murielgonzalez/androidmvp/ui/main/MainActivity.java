package com.murielgonzalez.androidmvp.ui.main;

import android.os.Bundle;
import com.murielgonzalez.androidmvp.R;
import com.murielgonzalez.androidmvp.utils.ActivityUtils;
import javax.inject.Inject;
import dagger.Lazy;
import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {

  private static final String TAG =  MainActivity.class.getSimpleName();
  @Inject
  MainActivityPresenter mPresenter;
  @Inject
  Lazy<MainActivityFragment> mMainActivityFragmentProvider;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.app_tabs_main);

    MainActivityFragment fragment = (MainActivityFragment) getSupportFragmentManager()
            .findFragmentById(R.id.fragment_container);

    if (fragment == null) {
      fragment = mMainActivityFragmentProvider.get();
      ActivityUtils.addFragmentToActivity(
          getSupportFragmentManager(), fragment, R.id.fragment_container
      );

    }

  }

}
