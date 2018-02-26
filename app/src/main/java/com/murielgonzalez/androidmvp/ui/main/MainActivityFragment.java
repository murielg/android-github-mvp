package com.murielgonzalez.androidmvp.ui.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.murielgonzalez.androidmvp.R;

import javax.inject.Inject;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by muriel_gonzalez on 2/20/18.
 */

public class MainActivityFragment extends Fragment implements MainActivityContract.View  {

  @Inject
  MainActivityContract.Presenter mPresenter;

  public final static String TAG = MainActivityFragment.class.getSimpleName();

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Log.d(TAG, "onCreate Fragment");
  }

  @Override
  public void setLoadingIndicator(boolean active) {

  }

  @Override
  public void setPresenter(MainActivityContract.Presenter presenter) {
    mPresenter= checkNotNull(presenter);
  }

  @Override
  public void onDestroyView() {
    super.onDestroyView();
//    mRecyclerView.setAdapter(null);
//    ButterKnife.unbind(this);
//    this.mFollowerListListener = null;
    mPresenter.unsubscribe();
  }
}
