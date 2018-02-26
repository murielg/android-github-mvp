package com.murielgonzalez.androidmvp.di.scopes;

import java.lang.annotation.Documented;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import javax.inject.Scope;

/**
 * Created by muriel_gonzalez on 2/26/18.
 */

@Documented
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface FragmentScoped {
}
