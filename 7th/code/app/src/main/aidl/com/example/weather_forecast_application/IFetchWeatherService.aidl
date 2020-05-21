// IFetchWeatherService.aidl
package com.example.weather_forecast_application;

// Declare any non-default types here with import statements
import com.example.weather_forecast_application.IfetchDataListener;

interface IFetchWeatherService {
    void retrieveWeatherData();
    void registerFetchDataListener(IFetchDataListener listener);
    void unregisterFetchDataListener(IFetchDataListener listener);
}