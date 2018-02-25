package com.murielgonzalez.androidmvp.data.local;

import android.content.Context;
import android.support.annotation.NonNull;
import com.murielgonzalez.androidmvp.data.AppDataStore;
import com.murielgonzalez.androidmvp.data.local.models.User;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * Created by muriel_gonzalez on 2/24/18.
 */

public class AppLocalDataStore implements AppDataStore {

  @Inject
  public AppLocalDataStore(@NonNull Context context) {

  }

  @Override
  public Observable<User> getUser() {
    return null;
  }
}
