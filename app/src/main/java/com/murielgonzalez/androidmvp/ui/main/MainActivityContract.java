package com.murielgonzalez.androidmvp.ui.main;

import com.murielgonzalez.androidmvp.ui.base.BasePresenter;
import com.murielgonzalez.androidmvp.ui.base.BaseView;

/**
 * Created by muriel_gonzalez on 2/20/18.
 */

public interface MainActivityContract {

  // Holds methods implemented by MainActivity
  interface View extends BaseView<Presenter> {

    void setLoadingIndicator(boolean active);

    // void showUsers(List<User> users);

  }

// Holds methods implemented in MainActivityPresenter
  interface Presenter extends BasePresenter {

    void loadPosts();

    void dropView();

  }
}
