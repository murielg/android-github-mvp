package com.murielgonzalez.androidmvp.data;

import android.support.annotation.NonNull;

import com.murielgonzalez.androidmvp.data.local.models.User;
import com.murielgonzalez.androidmvp.di.scopes.Remote;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;

/**
 * Created by muriel_gonzalez on 2/24/18.
 */

@Singleton
public class AppRepository implements AppDataSource {

  private final AppDataSource mAppDataSource;

  @Inject
  AppRepository(@Remote AppDataSource remoteDataStore) {
    mAppDataSource = remoteDataStore;
  }

  // TODO: Use Observable.concat to concat local and remote repositories.
  // If there's data in local DB, use that, if not, request from remote data service

  @Override
  public Observable<User> getUser(@NonNull final String username) {
    return mAppDataSource.getUser(username);
  }
}
