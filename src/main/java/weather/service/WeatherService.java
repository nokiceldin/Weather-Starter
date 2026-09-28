package weather.service;

import weather.model.WeatherData;
import weather.model.Location;

public class WeatherService {
    public WeatherData getWeather(Location l){
        return new WeatherData(70.0, 65.0, 20.1);
    };
}
