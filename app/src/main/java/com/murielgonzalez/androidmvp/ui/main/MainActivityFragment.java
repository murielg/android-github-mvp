package com.murielgonzalez.androidmvp.ui.main;

import android.support.v4.app.Fragment;
import android.support.annotation.NonNull;

import javax.inject.Inject;

/**
 * Created by muriel_gonzalez on 2/20/18.
 */

public class MainActivityFragment extends Fragment implements MainActivityContract.View {

  @Inject
  MainActivityContract.Presenter mPresenter;

  @Override
  public void setLoadingIndicator(boolean active) {

  }


}
