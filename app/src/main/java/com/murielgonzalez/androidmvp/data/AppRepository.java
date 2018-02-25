package com.murielgonzalez.androidmvp.data;

import com.murielgonzalez.androidmvp.data.local.AppLocalDataStore;
import com.murielgonzalez.androidmvp.data.local.models.User;
import com.murielgonzalez.androidmvp.data.remote.AppRemoteDataStore;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * Created by muriel_gonzalez on 2/24/18.
 */

public class AppRepository implements AppDataStore {

  private AppLocalDataStore mAppLocalDataStore;

  private AppRemoteDataStore mAppRemoteDataStore;

  @Inject
  public AppRepository(AppLocalDataStore localDataStore, AppRemoteDataStore remoteDataStore) {
    this.mAppLocalDataStore = localDataStore;
    this.mAppRemoteDataStore = remoteDataStore;
  }


  // TODO: Use Observable.concat to concat local and remote repositories.
  // If there's data in local DB, use that, if not, request from remote data service

  @Override
  public Observable<User> getUser() {
    return mAppRemoteDataStore.getUser();
  }
}
