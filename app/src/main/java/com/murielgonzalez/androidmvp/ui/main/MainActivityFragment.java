package com.murielgonzalez.androidmvp.ui.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.murielgonzalez.androidmvp.di.scopes.ActivityScoped;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;


/**
 * Created by muriel_gonzalez on 2/20/18.
 */

@ActivityScoped
public class MainActivityFragment extends DaggerFragment implements MainActivityContract.View  {

  @Inject
  MainActivityContract.Presenter mPresenter;

  public final static String TAG = MainActivityFragment.class.getSimpleName();

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Log.d(TAG, "onCreate Fragment");
    mPresenter.loadUser("murielg", true);
  }

  @Override
  public void setLoadingIndicator(boolean active) {

  }

  @Inject
  public MainActivityFragment() {
    // Requires empty public constructor
  }

  @Override
  public void onResume() {
    super.onResume();
    mPresenter.takeView(this);
  }

  @Override
  public void onDestroyView() {
    super.onDestroyView();
    // Example methods to call in onDestroyView
    //  mRecyclerView.setAdapter(null);
    //  ButterKnife.unbind(this);
    //  this.mFollowerListListener = null;
    mPresenter.dropView();

  }
}
