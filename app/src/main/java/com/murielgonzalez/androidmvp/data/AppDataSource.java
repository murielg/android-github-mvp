package com.murielgonzalez.androidmvp.data;

import com.murielgonzalez.androidmvp.data.models.User;

import io.reactivex.Observable;

/**
 * Created by muriel_gonzalez on 2/24/18.
 */

public interface AppDataSource {

  Observable<User> getUser(String username);

}
