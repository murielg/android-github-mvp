package com.murielgonzalez.androidmvp.rx;

import io.reactivex.Scheduler;

/**
 * Created by muriel_gonzalez on 2/20/18.
 */

public interface SchedulerProvider {

    Scheduler ui();

    Scheduler computation();

    Scheduler io();
}
