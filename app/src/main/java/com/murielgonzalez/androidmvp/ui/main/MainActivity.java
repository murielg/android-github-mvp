package com.murielgonzalez.androidmvp.ui.main;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.murielgonzalez.androidmvp.App;
import com.murielgonzalez.androidmvp.R;
import com.murielgonzalez.androidmvp.data.AppRepository;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

  private static final String TAG =  MainActivity.class.getSimpleName();

  private MainActivityContract.Presenter mPresenter;

  @Inject
  AppRepository mRepository;

  @Override
  protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);

    App.getComponent().inject(this);

    new MainActivityPresenter(mRepository, this);

  }

  @Override
  public void setPresenter(MainActivityContract.Presenter presenter) {
    mPresenter = presenter;
  }

  @Override
  public void setLoadingIndicator(boolean active) {

  }


}
