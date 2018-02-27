package com.murielgonzalez.androidmvp.ui.main;


import android.support.annotation.NonNull;
import android.util.Log;

import com.murielgonzalez.androidmvp.data.AppRepository;
import com.murielgonzalez.androidmvp.rx.SchedulerProvider;

import javax.annotation.Nullable;

import io.reactivex.disposables.CompositeDisposable;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by muriel_gonzalez on 2/20/18.
 */

public class MainActivityPresenter implements MainActivityContract.Presenter {

  private static final String TAG = MainActivityPresenter.class.getSimpleName();

  @Nullable private MainActivityContract.View mView;

  @NonNull private SchedulerProvider mSchedulerProvider;

  private AppRepository mAppRepository;

  private final CompositeDisposable disposables = new CompositeDisposable();

  public MainActivityPresenter(AppRepository appRepository, MainActivityContract.View view) {
    Log.d(TAG, "MainActivityPresenter");

    this.mAppRepository = appRepository;

    this.mView = view;

    mView.setPresenter(this);

  }

  @Override
  public void loadPosts() {

  }

  @Override
  public void subscribe() {
    loadPosts();
  }

  @Override
  public void unsubscribe() {
    this.mView = null;
    disposables.clear();

  }

  @Override
  public void dropView() {
    mView = null;
  }
}
