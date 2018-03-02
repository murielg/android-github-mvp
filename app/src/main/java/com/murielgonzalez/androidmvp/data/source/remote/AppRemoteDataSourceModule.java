package com.murielgonzalez.androidmvp.data.source.remote;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.facebook.stetho.okhttp3.StethoInterceptor;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.murielgonzalez.androidmvp.BuildConfig;
import com.murielgonzalez.androidmvp.data.AppDataSource;
import com.murielgonzalez.androidmvp.di.scopes.Remote;
import com.murielgonzalez.androidmvp.utils.AppConstants;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by muriel_gonzalez on 3/1/18.
 */
@Module
public class AppRemoteDataSourceModule {

    @Remote
    @Singleton
    @Provides
    AppDataSource provideAppDataSource(Services services) {
        return new AppRemoteDataSource(services);
    }

    @Singleton
    @Provides
    Services provideServices(@NonNull Retrofit retrofit) {
        return retrofit.create(Services.class);
    }

    @Singleton
    @Provides
    Retrofit provideRetrofit(@NonNull OkHttpClient okHttpClient, @NonNull Gson gson) {
        return new Retrofit.Builder()
                .baseUrl(AppConstants.BASE_ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient)
                .build();
    }

    @Singleton
    @Provides
    OkHttpClient provideOkHttpClient(@Nullable StethoInterceptor stethoInterceptor,
                                     @Nullable HttpLoggingInterceptor httpLoggingInterceptor) {
        final OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder();


        if (stethoInterceptor != null) {
            okHttpClientBuilder.addNetworkInterceptor(stethoInterceptor);
        }

        if (httpLoggingInterceptor != null) {
            httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            okHttpClientBuilder.addInterceptor(httpLoggingInterceptor);
        }

        return okHttpClientBuilder.build();
    }

    @Singleton
    @Provides
    Gson provideGson() {
        return new GsonBuilder()
                .setDateFormat(AppConstants.API_DATE_FORMAT)
                .create();
    }

    @Singleton
    @Nullable
    @Provides
    StethoInterceptor provideStethoInterceptor() {
        if (BuildConfig.DEBUG) {
            return new StethoInterceptor();
        }

        return null;
    }

    @Singleton
    @Nullable
    @Provides
    HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        if (BuildConfig.DEBUG) {
            return new HttpLoggingInterceptor();
        }

        return null;
    }


}
