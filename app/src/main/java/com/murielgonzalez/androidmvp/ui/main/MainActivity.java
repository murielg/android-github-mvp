package com.murielgonzalez.androidmvp.ui.main;


import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.murielgonzalez.androidmvp.App;
import com.murielgonzalez.androidmvp.R;

import javax.inject.Inject;

import static com.google.common.base.Preconditions.checkNotNull;

public class MainActivity extends AppCompatActivity {

  private static final String TAG =  MainActivity.class.getSimpleName();

  @Inject
  MainActivityPresenter mPresenter;


  @Override
  protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);


    setContentView(R.layout.activity_main);

    MainActivityFragment fragment =
            (MainActivityFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_container);

    if (fragment == null) {

      fragment = MainActivityFragment.createNew();
      FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
      transaction.add(R.id.fragment_container, fragment);
      transaction.commit();
    }

    DaggerMainActivityComponent.builder()
            .applicationComponent(((App) getApplication()).getComponent())
            .mainActivityModule(new MainActivityModule(fragment)).build()
            .inject(this);

  }

}
