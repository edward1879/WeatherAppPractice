package com.example.android.weatherapppickup;

import java.util.ArrayList;

/**
 * Created by SunnyChan on 3/11/2016.
 */

public class Weather {
    /** declare the  */
    private String date;
    private String averageTemp;
    private String weatherDescription;
    private int weatherIcon;

    public Weather() {
    }

    public Weather(String date, String averageTemp, String weatherDescription) {
        this.date = date;
        this.averageTemp = averageTemp;
        this.weatherDescription = weatherDescription;
    }

    public Weather(String date, String averageTemp, String weatherDescription, int weatherIcon) {
        this.date = date;
        this.averageTemp = averageTemp;
        this.weatherDescription = weatherDescription;
        this.weatherIcon = weatherIcon;
    }

    public static ArrayList<Weather> sampleWeatherArrayList(int numOfDays){
        ArrayList<Weather> weathers = new ArrayList<>();
        for (int i = 0; i<numOfDays;i++){
            String date = i + "- Nov";
            String averageTemp = i + 25 + "";
            String weatherDescription = "Sunny";

            Weather weather = new Weather(date,averageTemp,weatherDescription);
            weathers.add(weather);
        }

        return weathers;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAverageTemp() {
        return averageTemp;
    }

    public void setAverageTemp(String averageTemp) {
        this.averageTemp = averageTemp;
    }

    public String getWeatherDescription() {
        return weatherDescription;
    }

    public void setWeatherDescription(String weatherDescription) {
        this.weatherDescription = weatherDescription;
    }

    public int getWeatherIcon() {
        return weatherIcon;
    }

    public void setWeatherIcon(int weatherIcon) {
        this.weatherIcon = weatherIcon;
    }
}