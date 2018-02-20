package com.murielgonzalez.androidmvp.rx;

import io.reactivex.Scheduler;

/**
 * Created by muriel_gonzalez on 2/20/18.
 */

public class AppSchedulerProvider implements SchedulerProvider {
    @Override
    public Scheduler ui() {
        return null;
    }

    @Override
    public Scheduler computation() {
        return null;
    }

    @Override
    public Scheduler io() {
        return null;
    }
}
