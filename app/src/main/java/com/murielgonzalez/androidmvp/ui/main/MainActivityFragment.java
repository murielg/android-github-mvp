package com.murielgonzalez.androidmvp.ui.main;

import android.support.v4.app.Fragment;
import android.support.annotation.NonNull;

import javax.inject.Inject;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by muriel_gonzalez on 2/20/18.
 */

public class MainActivityFragment extends Fragment implements MainActivityContract.View {

  public final static String TAG = MainActivityFragment.class.getSimpleName();

  private MainActivityContract.Presenter mPresenter;

  @Override
  public void setLoadingIndicator(final boolean active) {
  //  mRecyclerView.setVisibility(View.GONE);
    //mEmptyView.setVisibility(View.GONE);
    //mProgress.setVisibility(View.VISIBLE);
  }

  @Override
  public void setPresenter(MainActivityContract.Presenter presenter) {
    mPresenter = checkNotNull(presenter);
  }
}
