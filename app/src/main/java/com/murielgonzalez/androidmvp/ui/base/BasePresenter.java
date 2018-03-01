package com.murielgonzalez.androidmvp.ui.base;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * Created by muriel_gonzalez on 2/20/18.
 */

public interface BasePresenter<T> {

//    void subscribe();
//
//    void unsubscribe();

    void takeView(T view);

    void dropView();

}