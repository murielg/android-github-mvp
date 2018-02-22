package com.murielgonzalez.androidmvp.data.db;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.murielgonzalez.androidmvp.di.ApplicationContext;
import com.murielgonzalez.androidmvp.di.DatabaseInfo;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by muriel_gonzalez on 2/20/18.
 */

@Singleton
public class DbOpenHelper {

    @Inject
    public DbOpenHelper(@ApplicationContext Context context) {

    }

/*
    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
*/


}
