package com.example.android.weatherapppickup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    /** declare a ListView object named listView */
    private ListView listView;
    private WeatherListAdapter weatherListAdapter;
    private ArrayList<Weather> weatherArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** bind the ListView in the layout with the listView object here by findViewById, then cast the view to a ListView */
        listView = (ListView) findViewById(R.id.lv_main);

        weatherArrayList = Weather.sampleWeatherArrayList(20);
        weatherListAdapter = new WeatherListAdapter(weatherArrayList,this);
        listView.setAdapter(weatherListAdapter);



    }
}
