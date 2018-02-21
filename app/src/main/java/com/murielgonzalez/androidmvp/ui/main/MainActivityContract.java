package com.murielgonzalez.androidmvp.ui.main;

import com.murielgonzalez.androidmvp.ui.base.BasePresenter;
import com.murielgonzalez.androidmvp.ui.base.BaseView;

/**
 * Created by muriel_gonzalez on 2/20/18.
 */

public interface MainActivityContract {

  interface  View extends BaseView<Presenter> {

    void setLoadingIndicator(boolean active);

  }

  interface Presenter extends BasePresenter {

  }
}
