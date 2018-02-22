package com.murielgonzalez.androidmvp.data.network;

import android.support.annotation.NonNull;

import com.murielgonzalez.androidmvp.data.network.model.Repo;
import com.murielgonzalez.androidmvp.data.network.model.User;

import io.reactivex.Observable;


/**
 * Created by muriel_gonzalez on 2/20/18.
 */

public interface ApiHelper {

    Observable<User> getUser(@NonNull String username);

}
