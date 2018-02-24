package com.murielgonzalez.androidmvp.data.network;

import com.murielgonzalez.androidmvp.data.network.model.User;


import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;


/**
 * Created by muriel_gonzalez on 2/23/18.
 */

public interface ApiInterface {
    @GET("users/{user}")
    Observable<User> getUser(@Path("user") String username);
}
