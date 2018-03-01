package com.murielgonzalez.androidmvp.rx;

import io.reactivex.observers.DisposableObserver;

/**
 * Created by muriel_gonzalez on 3/1/18.
 */

public class DefaultObserver<T> extends DisposableObserver<T> {
    @Override
    public void onNext(T t) {

    }

    @Override
    public void onError(Throwable e) {

    }

    @Override
    public void onComplete() {

    }
}
