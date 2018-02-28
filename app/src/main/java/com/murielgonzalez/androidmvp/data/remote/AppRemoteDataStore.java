package com.murielgonzalez.androidmvp.data.remote;

import com.murielgonzalez.androidmvp.data.AppDataStore;
import com.murielgonzalez.androidmvp.data.api.AppInterface;
import com.murielgonzalez.androidmvp.data.local.models.User;

import javax.inject.Singleton;

import io.reactivex.Observable;

/**
 * Created by muriel_gonzalez on 2/24/18.
 */

@Singleton
public class AppRemoteDataStore implements AppDataStore {

  private static final String TAG = AppRemoteDataStore.class.getSimpleName();

  private AppInterface mService;

  public AppRemoteDataStore(AppInterface appInterface) {
    mService = appInterface;
  }

  @Override
  public Observable<User> getUser(String username) {

    // load from remote
    return mService.getUser(username);

  }

}
