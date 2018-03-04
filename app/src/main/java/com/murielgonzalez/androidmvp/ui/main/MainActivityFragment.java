package com.murielgonzalez.androidmvp.ui.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.murielgonzalez.androidmvp.R;
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
    // retain this fragment
    setRetainInstance(true);
    Log.d(TAG, "onCreate Fragment");
    mPresenter.loadUser("murielg", true);
  }

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


    View root = inflater.inflate(R.layout.mainactivity_frag, container, false);

    return root;
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
  public void onDestroy() {
    super.onDestroy();
    mPresenter.dropView();  //prevent leaking activity in
    // case presenter is orchestrating a long running task

    /*
      Example methods to call in onDestroy:
      mRecyclerView.setAdapter(null);
      ButterKnife.unbind(this);
      this.mFollowerListListener = null;
    */

  }

}
