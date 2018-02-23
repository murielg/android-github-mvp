package com.murielgonzalez.androidmvp.di.components;

import com.murielgonzalez.androidmvp.di.PerActivity;
import com.murielgonzalez.androidmvp.di.modules.ActivityModule;
import com.murielgonzalez.androidmvp.ui.main.MainActivity;

import dagger.Component;

/**
 * Created by muriel_gonzalez on 2/21/18.
 */
//  @PerActivity is a custom scoping annotation to permit objects whose lifetime should
// conform to the life of the activity to be memorized in the correct component.
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity activity);
}
