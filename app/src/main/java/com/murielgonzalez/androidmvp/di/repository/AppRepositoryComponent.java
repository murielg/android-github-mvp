package com.murielgonzalez.androidmvp.di.repository;

import android.content.Context;

import com.murielgonzalez.androidmvp.data.api.AppInterface;
import com.murielgonzalez.androidmvp.data.api.AppService;
import com.murielgonzalez.androidmvp.rx.SchedulerProvider;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by muriel_gonzalez on 2/27/18.
 */
@Singleton
@Component(modules = AppRepositoryModule.class)
public interface AppRepositoryComponent {

    Context context();

    AppService appService();

    AppInterface appInterface();

    SchedulerProvider scheduler();

}
