package com.murielgonzalez.androidmvp.ui.main;

import com.murielgonzalez.androidmvp.ui.base.BasePresenter;

import javax.annotation.Nullable;

/**
 * Created by muriel_gonzalez on 2/20/18.
 */

public class MainActivityPresenter implements MainActivityContract.Presenter {

  @Nullable
  private MainActivityContract.View mView;

  private static final String TAG = MainActivityPresenter.class.getSimpleName();


  @Override
  public void takeView(MainActivityContract.View view) {
    this.mView = view;
  }

  @Override
  public void dropView() {
    mView = null;
  }
}
