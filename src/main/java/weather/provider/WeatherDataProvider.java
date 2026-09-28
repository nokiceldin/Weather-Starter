package weather.provider;
import weather.model.Location;
import  weather.model.WeatherData;

public interface WeatherDataProvider {
    // providers need to take in Location object, and return WeatherData object
    WeatherData weather(Location l);

}
