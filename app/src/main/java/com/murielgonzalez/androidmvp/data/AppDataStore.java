package com.murielgonzalez.androidmvp.data;

import com.murielgonzalez.androidmvp.data.local.models.User;

import io.reactivex.Observable;

/**
 * Created by muriel_gonzalez on 2/24/18.
 */

public interface AppDataStore {
  Observable<User> getUser();
}
