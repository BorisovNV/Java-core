package lesson8;

import lesson8.entity.WeatherData;
import lesson8.enums.Func;
import lesson8.enums.Periods;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Controller {

    WeatherProv weatherProv = new AccuWeather();
    Map<Integer, Func> variantResult = new HashMap();

    public Controller() {
        variantResult.put(1, Func.GET_CURRENT_WEATHER);
        variantResult.put(2, Func.GET_WEATHER_IN_NEXT_5_DAYS);
    }

    public void onUserInput(String input) throws IOException {
        int command = Integer.parseInt(input);
        if (!variantResult.containsKey(command)) {
            throw new IOException("There is no command for command-key " + command);
        }

        switch (variantResult.get(command)) {
            case GET_CURRENT_WEATHER:
                getCurrentWeather();
                break;
            case GET_WEATHER_IN_NEXT_5_DAYS:
                getWeatherIn5Days();
                break;
        }
    }

    public void getCurrentWeather() throws IOException {
        weatherProv.getWeather(Periods.NOW);
    }

    public void getWeatherIn5Days() throws IOException {
        WeatherData weatherIn5Days = weatherProv.getWeatherIn5Days(Periods.FIVE_DAYS);
    }
}
