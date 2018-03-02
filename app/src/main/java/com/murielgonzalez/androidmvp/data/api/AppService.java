package com.murielgonzalez.androidmvp.data.api;

/**
 * Created by muriel_gonzalez on 2/28/18.
 */

public class AppService {

    private AppInterface mInterface;

    public AppService() {}

    public AppService(AppInterface anInterface) {
        this.mInterface = anInterface;
    }

    public AppInterface getInterface() {
        return mInterface;
    }
}
