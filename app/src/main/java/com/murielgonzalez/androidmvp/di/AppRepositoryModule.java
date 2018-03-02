package com.murielgonzalez.androidmvp.di;

import com.murielgonzalez.androidmvp.data.AppDataSource;
import com.murielgonzalez.androidmvp.data.AppRepository;
import com.murielgonzalez.androidmvp.data.source.remote.AppRemoteDataSource;
import com.murielgonzalez.androidmvp.di.scopes.Remote;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by muriel_gonzalez on 2/24/18.
 */

@Module
public class AppRepositoryModule {

  @Singleton
  @Provides
  AppRepository provideAppRepository(@Remote AppDataSource remoteDataSource) {
    return new AppRepository(remoteDataSource);
  }

  /*
  @Singleton
  @Binds
  @Remote
  abstract AppDataSource provideAppRemoteDataSource(AppRemoteDataSource remoteDataSource);

  */





  /*

    //private final Context mContext;

  //public AppRepositoryModule(Context context) {
  //  mContext = context;
  //}

//  @Provides
//  Context provideContext() {
//    return mContext;
//  }

  @Provides
  AppService provideAppService(AppInterface appService) {
    return new AppService(appService);
  }

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


//  @Provides
//  Cache providesHttpCache(Application application) {
//    int cacheSize = 10 * 1024 * 1024;
//    Cache cache = new Cache(application.getCacheDir(), cacheSize);
//    return cache;
//  }

*/
}
