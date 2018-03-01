package com.murielgonzalez.androidmvp.ui.main;


import android.support.annotation.NonNull;
import android.util.Log;

import com.murielgonzalez.androidmvp.data.AppRepository;
import com.murielgonzalez.androidmvp.data.models.User;
import com.murielgonzalez.androidmvp.di.scopes.ActivityScoped;
import com.murielgonzalez.androidmvp.rx.SchedulerProvider;

import javax.annotation.Nullable;
import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by muriel_gonzalez on 2/20/18.
 */
@ActivityScoped
public class MainActivityPresenter implements MainActivityContract.Presenter {

  private static final String TAG = MainActivityPresenter.class.getSimpleName();

  private final AppRepository mAppRepository;

  @Nullable
  private MainActivityContract.View mView;

  private boolean mFirstLoad = true;

  private final CompositeDisposable disposables = new CompositeDisposable();

  @NonNull
  private SchedulerProvider mSchedulerProvider;

  @Inject
  MainActivityPresenter(AppRepository appRepository,
                        @NonNull SchedulerProvider schedulerProvider) {

    Log.d(TAG, "MainActivityPresenter");

    this.mAppRepository = appRepository;

    this.mSchedulerProvider = schedulerProvider;

  }

  @Override
  public void loadUser(String username, boolean forceUpdate) {
    loadUser(username, forceUpdate || mFirstLoad, true);
    mFirstLoad = false;
  }

  private void loadUser(String username, boolean forceUpdate, boolean showLoadingIndicator) {
    disposables.clear();

    final Observable<User> observable = mAppRepository.getUser(username)
            .subscribeOn(mSchedulerProvider.io())
            .observeOn(AndroidSchedulers.mainThread());

    disposables.add(observable.subscribeWith(new UserObserver()));

  }

  private final class UserObserver extends com.murielgonzalez.androidmvp.rx.DefaultObserver<User> {
    @Override
    public void onNext(User user) {
      Log.d(TAG, user.toString());
    }

    @Override
    public void onError(Throwable e) {

    }

    @Override
    public void onComplete() {

    }
  }

  //  @Override
//  public void unsubscribe() {
//    this.mView = null;
//    disposables.clear();
//
//  }


  @Override
  public void takeView(MainActivityContract.View view) {
    //takeView is similar to subscribe
    this.mView = view;
    disposables.clear();
  }

  @Override
  public void dropView() {
    mView = null;
  }
}
