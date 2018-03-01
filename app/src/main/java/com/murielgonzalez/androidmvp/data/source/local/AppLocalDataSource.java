package com.murielgonzalez.androidmvp.data.source.local;

import com.murielgonzalez.androidmvp.data.AppDataSource;
import com.murielgonzalez.androidmvp.data.models.User;

import io.reactivex.Observable;

/**
 * Created by muriel_gonzalez on 2/24/18.
 */

public class AppLocalDataSource implements AppDataSource {

  @Override
  public Observable<User> getUser(String username) {
    return null;
  }

}
