package com.murielgonzalez.androidmvp.data;

import com.murielgonzalez.androidmvp.data.db.DbHelper;
import com.murielgonzalez.androidmvp.data.network.ApiHelper;
import com.murielgonzalez.androidmvp.data.prefs.PrefsHelper;

/**
 * Created by muriel_gonzalez on 2/19/18.
 */
// DataManager interface implemented by AppDataManager
// It contains methods, exposed for all the data handling operations.
// It delegates the services provided by all the Helper classes

public interface DataManager extends DbHelper, PrefsHelper, ApiHelper {

}
