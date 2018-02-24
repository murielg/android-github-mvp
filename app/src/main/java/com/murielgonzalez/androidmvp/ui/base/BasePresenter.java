package com.murielgonzalez.androidmvp.ui.base;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * Created by muriel_gonzalez on 2/20/18.
 */

public interface BasePresenter{

    void subscribe();

    void unsubscribe();

}