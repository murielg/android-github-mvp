package com.murielgonzalez.androidmvp.di.modules;

import android.app.Application;
import android.content.Context;

import com.murielgonzalez.androidmvp.App;
import com.murielgonzalez.androidmvp.data.AppDataManager;
import com.murielgonzalez.androidmvp.data.DataManager;
import com.murielgonzalez.androidmvp.data.db.AppDbHelper;
import com.murielgonzalez.androidmvp.data.db.DbHelper;
import com.murielgonzalez.androidmvp.data.network.ApiHelper;
import com.murielgonzalez.androidmvp.data.network.AppApiHelper;
import com.murielgonzalez.androidmvp.data.prefs.AppPrefsHelper;
import com.murielgonzalez.androidmvp.data.prefs.PrefsHelper;
import com.murielgonzalez.androidmvp.di.PreferenceInfo;
import com.murielgonzalez.androidmvp.utils.AppConstants;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by muriel_gonzalez on 2/21/18.
 */
//Application Module will provide dependencies for app-wide dependencies
@Module
public class ApplicationModule {

    private final Context mContext;

    public ApplicationModule(Context context) {
        mContext = context;
    }

    @Provides
    Context provideContext(App app){
        return app.getApplicationContext();
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
