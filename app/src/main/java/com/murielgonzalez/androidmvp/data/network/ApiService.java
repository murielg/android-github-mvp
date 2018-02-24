package com.murielgonzalez.androidmvp.data.network;

/**
 * Created by muriel_gonzalez on 2/24/18.
 */

public class ApiService {

  private ApiInterface mApiInterface;

  public ApiService() {}

  public ApiService(ApiInterface apiInterface) {
    this.mApiInterface = apiInterface;
  }

  public ApiInterface getApiInterface() {
    return mApiInterface;
  }

}
