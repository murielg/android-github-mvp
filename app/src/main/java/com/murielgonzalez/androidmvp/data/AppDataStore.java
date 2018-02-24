package com.murielgonzalez.androidmvp.data;

import com.murielgonzalez.androidmvp.data.network.model.User;

import java.util.List;
import io.reactivex.Observable;

/**
 * Created by muriel_gonzalez on 2/24/18.
 */

public interface AppDataStore {
  Observable<List<User>> getUsers();
}
