package lesson8;

import lesson8.enums.Periods;
import lesson8.entity.WeatherData;

import java.io.IOException;

public interface WeatherProv {
    void getWeather(Periods periods) throws IOException;

    WeatherData getAllFromDb() throws IOException;

    WeatherData getWeatherIn5Days(Periods periods) throws IOException;
}
