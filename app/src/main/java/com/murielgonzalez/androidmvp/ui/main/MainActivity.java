package com.murielgonzalez.androidmvp.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.murielgonzalez.androidmvp.R;
import com.murielgonzalez.androidmvp.data.AppRepository;

import javax.inject.Inject;

import dagger.Lazy;

public class MainActivity extends AppCompatActivity {

  private static final String TAG =  MainActivity.class.getSimpleName();

  @Inject
  AppRepository mRepository;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_main);

    MainActivityFragment mainActivityFragment = (MainActivityFragment) getSupportFragmentManager()
        .findFragmentById(R.id.fragment_container);


  }
}
