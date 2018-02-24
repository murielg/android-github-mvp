package com.murielgonzalez.androidmvp.ui.base;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * Created by muriel_gonzalez on 2/20/18.
 */

public interface BasePresenter<T> {

    void takeView(T view);

    void dropView();

}

/*
public abstract class BasePresenter<V> {


    protected final V view;

    private CompositeDisposable disposables = new CompositeDisposable();

    protected BasePresenter(V view) {
        this.view = view;
    }

    // Contains common setup actions for all presenters
    // Any subclass may override this
    public void start() {

    }

    // Contains vleanup actions for all presenters
    public void stop(){
        disposables.clear();
    }

    protected void addDisposable(Disposable disposable) {
        disposables.add(disposable);
    }

}
*/