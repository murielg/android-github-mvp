package com.murielgonzalez.androidmvp.data.source.remote;

import com.murielgonzalez.androidmvp.data.models.User;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by muriel_gonzalez on 3/1/18.
 */

public interface Services {
    @GET("users/{user}")
    Observable<User> getUser(@Path("user") String userName);
}
