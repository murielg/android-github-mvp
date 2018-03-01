package com.murielgonzalez.androidmvp.utils;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by muriel_gonzalez on 2/21/18.
 */

public class ActivityUtils {
  public static void addFragmentToActivity (@NonNull FragmentManager fragmentManager,
                                            @NonNull Fragment fragment, int frameId) {
    checkNotNull(fragmentManager);
    checkNotNull(fragment);
    FragmentTransaction transaction = fragmentManager.beginTransaction();
    transaction.add(frameId, fragment);
    transaction.commit();
  }
}
