package com.ekc.c4q.jsonweather;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.ekc.c4q.jsonweather.internal.WeatherHelper;
import com.ekc.c4q.jsonweather.model.Weather;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  private WeatherAdapter adapter;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // You will probably need this
    List<Weather> weatherList = WeatherHelper.getWeather(this);

    /**
     * RecyclerView exercise: Add a RecyclerView to MainActivity and display a list of weather
     * items, showing the icon, title, and description.
     *
     * Hint: You will probably need to look inside the five_day_forecast.json file to figure out
     * how to intelligently key off the icons
     *
     * The icons you should use are under drawable-dpi/ic_*
     */
    RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
    recyclerView.setLayoutManager(new LinearLayoutManager(this));
    adapter = new WeatherAdapter();
    recyclerView.setAdapter(adapter);
    adapter.setWeatherList(weatherList);
  }
}
