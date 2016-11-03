package com.example.android.weatherapppickup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by SunnyChan on 4/11/2016.
 */

public class WeatherListAdapter extends BaseAdapter{
    /** storing the arraylist of weather objects */
    private ArrayList<Weather> dataset;
    private Context context;

    public WeatherListAdapter(ArrayList<Weather> dataset, Context context) {
        this.dataset = dataset;
        this.context = context;
    }

    /** return the number of item in the arraylist */
    @Override
    public int getCount() {
        return dataset.size();
    }

    /** get the object with index i from the arraylist of weather */
    @Override
    public Object getItem(int i) {
        return dataset.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    /** return the layout of a cell
     * use a ViewHolder to hold the views to increase the performance of the listView
     * LayoutInflater: inflate the cell layout to the view object
     * findViewById from the view object and bind them to the corresponding views in the ViewHolder
     *
     * then set text and image to the corresponding views
     * */
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Weather weather = (Weather) getItem(i);
        ViewHolder viewHolder = new ViewHolder();

        if (view==null){
            view = LayoutInflater.from(context).inflate(R.layout.weather_cell,viewGroup,false);
            viewHolder.ivWeatherImage = (ImageView) view.findViewById(R.id.iv_weatherImage);
            viewHolder.tvDate = (TextView) view.findViewById(R.id.tv_date);
            viewHolder.tvAverageTemp = (TextView) view.findViewById(R.id.tv_averageTemp);
            viewHolder.tvWeatherDescription = (TextView) view.findViewById(R.id.tv_weatherDescription);
            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.ivWeatherImage.setImageDrawable(
                context.getApplicationContext().getResources().getDrawable(weather.getWeatherIcon()));
        viewHolder.tvWeatherDescription.setText(weather.getWeatherDescription());
        viewHolder.tvAverageTemp.setText(weather.getAverageTemp());
        viewHolder.tvDate.setText(weather.getDate());

        return view;
    }

    /** an inner class to hold views */
    private class ViewHolder{
        ImageView ivWeatherImage;
        TextView tvDate;
        TextView tvAverageTemp;
        TextView tvWeatherDescription;
    }
}
