package com.murielgonzalez.androidmvp.di.modules;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.murielgonzalez.androidmvp.di.ActivityContext;
import com.murielgonzalez.androidmvp.di.PerActivity;
import com.murielgonzalez.androidmvp.ui.main.MainActivityPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by muriel_gonzalez on 2/21/18.
 */

@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context getContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }


}
