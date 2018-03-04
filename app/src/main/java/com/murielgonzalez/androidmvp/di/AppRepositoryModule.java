package com.murielgonzalez.androidmvp.di;

import android.content.Context;

import com.murielgonzalez.androidmvp.data.AppDataSource;
import com.murielgonzalez.androidmvp.data.AppRepository;
import com.murielgonzalez.androidmvp.data.source.prefs.SharedPrefs;
import com.murielgonzalez.androidmvp.di.scopes.Remote;
import javax.inject.Singleton;
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

//  @Singleton
//  @Provides
//  SharedPrefs provideSharedPreferences(Context context, String prefFileName) {
//    return new SharedPrefs(context, prefFileName);
//  }

  /*
  @Singleton
  @Provides
  AppRepository provideAppRepository(@Remote AppDataSource remoteDataSource,
                                      @Local AppDataSource localDataSource) {
    return new AppRepository(remoteDataSource, localDataSource);
  }
   */


}
