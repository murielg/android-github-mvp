package com.murielgonzalez.androidmvp.rx;

import android.support.annotation.NonNull;

import javax.inject.Inject;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by muriel_gonzalez on 2/20/18.
 */

public class SchedulerProvider implements BaseSchedulerProvider {

    // Prevent direct instantiation.
    @Inject
    public SchedulerProvider() {
    }

    @Override
    @NonNull
    public Scheduler computation() {
        return Schedulers.computation();
    }

    @Override
    @NonNull
    public Scheduler io() {
        return Schedulers.io();
    }
}
