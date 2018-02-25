package com.murielgonzalez.androidmvp.data.remote;

import com.murielgonzalez.androidmvp.App;
import com.murielgonzalez.androidmvp.data.AppDataStore;
import com.murielgonzalez.androidmvp.data.local.AppLocalDataStore;
import com.murielgonzalez.androidmvp.data.local.models.User;


import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.functions.Action;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by muriel_gonzalez on 2/24/18.
 */

public class AppRemoteDataStore  implements AppDataStore {

  @Inject
  Retrofit retrofit;

  @Inject
  AppLocalDataStore appLocalDataStore;

  public AppRemoteDataStore() {
    App.getComponent().inject(this);
  }

  @Override
  public Observable<User> getUser() {
    // load from remote
    return retrofit.create(UserService.class).getUser("murielg");
  }

  private interface UserService {
    @GET("users/{user}")
    Observable<User> getUser(@Path("user") String username);
  }
}
