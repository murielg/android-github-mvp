package com.murielgonzalez.androidmvp.data.source.remote;

import com.murielgonzalez.androidmvp.data.AppDataSource;
import com.murielgonzalez.androidmvp.data.api.AppInterface;
import com.murielgonzalez.androidmvp.data.models.User;

import javax.inject.Singleton;

import io.reactivex.Observable;

/**
 * Created by muriel_gonzalez on 2/24/18.
 */

@Singleton
public class AppRemoteDataSource implements AppDataSource {

  private static final String TAG = AppRemoteDataSource.class.getSimpleName();

  private AppInterface mService;

  public AppRemoteDataSource(AppInterface appInterface) {
    mService = appInterface;
  }

  @Override
  public Observable<User> getUser(String username) {

    // load from remote
    return mService.getUser(username);

  }

}
