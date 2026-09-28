package weather.cli;

import weather.model.Location;
import weather.model.WeatherData;
import weather.service.WeatherService;

public class WeatherCLI {

    private final WeatherService service;

    public WeatherCLI(WeatherService service) {
        this.service = service;
    }

    public void run() {
        Location chicago = new Location("Chicago", 41.8781, -87.6298);

        WeatherData data = service.getCurrentWeather(chicago);

        System.out.println("Weather Information Service");
        System.out.println("Temperature: " + data.temp());
        System.out.println("Humidity: " + data.humidity());
        System.out.println("Wind Speed: " + data.precipitation());
    }
    //ddd
}