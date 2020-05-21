// IFetchDataListener.aidl
package com.example.weather_forecast_application;

interface IFetchDataListener {
    void onWeatherDataRetrieved(out String[] data);
}