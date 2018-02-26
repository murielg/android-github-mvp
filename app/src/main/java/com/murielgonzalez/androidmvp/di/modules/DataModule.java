package com.murielgonzalez.androidmvp.di.modules;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.murielgonzalez.androidmvp.data.local.AppLocalDataStore;
import com.murielgonzalez.androidmvp.data.remote.AppRemoteDataStore;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by muriel_gonzalez on 2/24/18.
 */

@Module
public class DataModule {

  private String mBaseUrl;

  public DataModule(String mBaseUrl) {
    this.mBaseUrl = mBaseUrl;
  }

  @Provides
  @Singleton
  // Application reference must come from ApplicationModule.class
  SharedPreferences providesSharedPreferences(Application application) {
    return PreferenceManager.getDefaultSharedPreferences(application);
  }

  @Provides
  @Singleton
  Cache provideHttpCache(Application application) {
    int cacheSize = 10 * 1024 * 1024;
    Cache cache = new Cache(application.getCacheDir(), cacheSize);
    return cache;
  }

  @Provides
  @Singleton
  Gson providesGson() {
    GsonBuilder gsonBuilder = new GsonBuilder();
    gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
    return gsonBuilder.create();
  }

  @Provides
  @Singleton
  OkHttpClient providesOkhttpClient(Cache cache) {
    OkHttpClient.Builder client = new OkHttpClient.Builder();
    client.cache(cache);
    return client.build();
  }

  @Provides
  @Singleton
  // Retrofit instance depends both on a Gson and OkHttpClient instance, so we can define
  // another method within the same class that takes these two types.
  // The @Provides annotation and these two parameters in the method will cause Dagger
  // to recognize that there is a dependency on Gson and OkHttpClient to build a Retrofit instance.
  Retrofit providesRetrofit(Gson gson, OkHttpClient okHttpClient) {
    Retrofit retrofit = new Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create(gson))
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .baseUrl(mBaseUrl)
        .client(okHttpClient)
        .build();
    return retrofit;
  }

  @Provides
  @Singleton
  AppLocalDataStore providesAppLocalDataStore(Application context) {
    return new AppLocalDataStore(context);
  }


  @Provides
  @Singleton
  AppRemoteDataStore providesRepository() {
    return new AppRemoteDataStore();
  }



}
