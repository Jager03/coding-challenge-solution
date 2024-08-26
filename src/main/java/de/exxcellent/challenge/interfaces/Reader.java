package de.exxcellent.challenge.interfaces;

import de.exxcellent.challenge.classes.FootballTeam;
import de.exxcellent.challenge.classes.Weather;
import java.util.List;
public interface Reader {
    public List<Weather> readWeatherData(String filePath);
    public List<FootballTeam> readFootballData(String filePath);
}
