package lesson8;

import lesson8.entity.WeatherData;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

// Репо домашка
public interface DBRepo {

    boolean saveWeatherData(WeatherData weatherData) throws SQLException;

    List<WeatherData> getAllSavedData() throws IOException;
}
