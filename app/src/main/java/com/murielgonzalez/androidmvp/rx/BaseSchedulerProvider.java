package com.murielgonzalez.androidmvp.rx;

import android.support.annotation.NonNull;

import io.reactivex.Scheduler;

/**
 * Created by muriel_gonzalez on 2/20/18.
 */

public interface BaseSchedulerProvider  {
    @NonNull
    Scheduler computation();

    @NonNull
    Scheduler io();
}
