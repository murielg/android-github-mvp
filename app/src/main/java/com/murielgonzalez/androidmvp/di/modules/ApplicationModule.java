package com.murielgonzalez.androidmvp.di.modules;

import android.app.Application;
import android.content.Context;

import com.murielgonzalez.androidmvp.App;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by muriel_gonzalez on 2/21/18.
 */

@Module
public class ApplicationModule {

    Application mApplication;

    public ApplicationModule(Application application) {
        this.mApplication = application;
    }

    @Provides
    @Singleton
    Application provideApplication() {
        return mApplication;
    }

//    @Provides
//    @Singleton
//    DataManager provideDataManager(AppDataManager appDataManager) {
//        return appDataManager;
//    }
//
//    @Provides
//    @Singleton
//    DbHelper provideDbHelper(AppDbHelper appDbHelper) {
//        return appDbHelper;
//    }
//
//    @Provides
//    @Singleton
//    PrefsHelper providePrefsHelper(AppPrefsHelper appPrefsHelper){ return appPrefsHelper;}
//
//    @Provides
//    @Singleton
//    ApiHelper provideApiHelper(AppApiHelper appApiHelper) {
//        return appApiHelper;
//    }
//
//    @Provides
//    @PreferenceInfo
//    String providePreferenceName() {
//        return AppConstants.PREF_NAME;
//    }


}
