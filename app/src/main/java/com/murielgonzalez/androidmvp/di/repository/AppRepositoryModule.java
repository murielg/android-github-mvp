package com.murielgonzalez.androidmvp.di.repository;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.murielgonzalez.androidmvp.data.api.AppInterface;
import com.murielgonzalez.androidmvp.data.api.AppService;
import com.murielgonzalez.androidmvp.rx.SchedulerProvider;
import com.murielgonzalez.androidmvp.utils.AppConstants;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by muriel_gonzalez on 2/24/18.
 */

@Module
public class AppRepositoryModule {

  private final Context mContext;

  public AppRepositoryModule(Context context) {
    mContext = context;
  }

  @Provides
  Context provideContext() {
    return mContext;
  }

  @Provides
  AppService provideAppService(AppInterface appInterface) {
    return new AppService(appInterface);
  }

//  @Provides
//  Cache providesHttpCache(Application application) {
//    int cacheSize = 10 * 1024 * 1024;
//    Cache cache = new Cache(application.getCacheDir(), cacheSize);
//    return cache;
//  }

  @Provides
  Gson provideGson() {
    GsonBuilder gsonBuilder = new GsonBuilder();
    gsonBuilder
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .setDateFormat("yyyy-MM-dd");

    return gsonBuilder.create();
  }

  @Provides
  OkHttpClient providesUrlInterceptor() {
    OkHttpClient.Builder client = new OkHttpClient.Builder();
    return client.build();
  }

  @Provides
  @Singleton
  AppInterface provideAppInterface(OkHttpClient okHttpClient, Gson gson) {
    Retrofit retrofit = new Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .baseUrl(AppConstants.BASE_ENDPOINT)
            .client(okHttpClient)
            .build();

    return retrofit.create(AppInterface.class);
  }

  @Provides
  @Singleton
  SchedulerProvider providesScheduler() {
    return  new SchedulerProvider();
  }


    @Provides
  @Singleton
  // Application reference must come from ApplicationModule.class
  SharedPreferences providesSharedPreferences(Application application) {
    return PreferenceManager.getDefaultSharedPreferences(application);
  }

}
