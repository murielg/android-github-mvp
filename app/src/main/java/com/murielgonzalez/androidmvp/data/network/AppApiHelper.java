package com.murielgonzalez.androidmvp.data.network;

import android.support.annotation.NonNull;

import com.murielgonzalez.androidmvp.data.network.model.User;

import javax.inject.Singleton;

import io.reactivex.Observable;

/**
 * Created by muriel_gonzalez on 2/20/18.
 */

// Manages the network API calls and API data handling.
@Singleton
public class AppApiHelper implements ApiHelper {

    @Override
    public Observable<User> getUser(@NonNull String username) {
        return null;
    }


}
