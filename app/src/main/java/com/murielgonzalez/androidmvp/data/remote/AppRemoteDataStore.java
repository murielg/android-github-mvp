package com.murielgonzalez.androidmvp.data.remote;

import com.murielgonzalez.androidmvp.App;
import com.murielgonzalez.androidmvp.data.AppDataStore;
import com.murielgonzalez.androidmvp.data.local.AppLocalDataStore;
import com.murielgonzalez.androidmvp.data.network.model.User;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;
import retrofit2.Retrofit;

/**
 * Created by muriel_gonzalez on 2/24/18.
 */

public class AppRemoteDataStore  implements AppDataStore{

  @Inject
  Retrofit retrofit;

  @Inject
  AppLocalDataStore appLocalDataStore;
  public AppRemoteDataStore() {
    App.getAppComponent().inject(this);
  }

  @Override
  public Observable<List<User>> getUsers() {
    // load from remote
    return null;
  }

  private interface UserService {

  }
}
