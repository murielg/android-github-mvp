package com.murielgonzalez.androidmvp.ui.main;

import android.support.v4.app.Fragment;
import android.support.annotation.NonNull;

/**
 * Created by muriel_gonzalez on 2/20/18.
 */

public class MainActivityFragment extends Fragment implements MainActivityContract.View {

  private MainActivityContract.Presenter mPresenter;

  @Override
  public void setLoadingIndicator(boolean active) {

  }

  @Override
  public void setPresenter(@NonNull MainActivityContract.Presenter presenter) {
    mPresenter = presenter;
  }
}
