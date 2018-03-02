package com.murielgonzalez.androidmvp.data.source.remote;

import android.support.annotation.NonNull;

import com.murielgonzalez.androidmvp.data.AppDataSource;
import com.murielgonzalez.androidmvp.data.models.User;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;

/**
 * Created by muriel_gonzalez on 2/24/18.
 */

@Singleton
public class AppRemoteDataSource implements AppDataSource {

  private static final String TAG = AppRemoteDataSource.class.getSimpleName();

  @NonNull
  private final Services mServices;

  @Inject
  AppRemoteDataSource(@NonNull Services services) {
    this.mServices = services;
  }

  @Override
  public Observable<User> getUser(String username) {
    return mServices.getUser(username);
  }

}
