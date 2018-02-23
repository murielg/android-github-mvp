package com.murielgonzalez.androidmvp.data;

import android.content.Context;
import android.support.annotation.NonNull;

import com.murielgonzalez.androidmvp.data.db.DbHelper;
import com.murielgonzalez.androidmvp.data.network.ApiHelper;
import com.murielgonzalez.androidmvp.data.network.model.User;
import com.murielgonzalez.androidmvp.data.prefs.PrefsHelper;
import com.murielgonzalez.androidmvp.di.ApplicationContext;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;

/**
 * Created by muriel_gonzalez on 2/20/18.
 */

// AppDataManager is the point of contact for any data related operation in the app
// It delegates all operations to their respective helpers

@Singleton
public class AppDataManager implements DataManager {

    private static final String TAG = AppDataManager.class.getSimpleName();

    private final Context mContext;
    private final DbHelper mDbHelper;
    private final PrefsHelper mPrefsHelper;
    private final ApiHelper mApiHelper;

    @Inject
    public AppDataManager(@ApplicationContext Context context,
                          DbHelper dbHelper,
                          PrefsHelper prefsHelper,
                          ApiHelper apiHelper
                          ) {
        mContext = context;
        mDbHelper = dbHelper;
        mPrefsHelper = prefsHelper;
        mApiHelper = apiHelper;
    }

    @Override
    public Observable<User> getUser(@NonNull String username) {
        return mApiHelper.getUser(username);
    }

    @Override
    public void setCurrentUserName(String userName) {
        mPrefsHelper.setCurrentUserName(userName);
    }
}
