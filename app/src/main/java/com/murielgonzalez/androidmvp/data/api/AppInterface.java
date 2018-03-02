package com.murielgonzalez.androidmvp.data.api;

import com.murielgonzalez.androidmvp.data.models.User;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by muriel_gonzalez on 2/28/18.
 */

public interface AppInterface {

    @GET("users/{uname}")
    Observable<User> getUser(@Path("uname") String uname);

}
