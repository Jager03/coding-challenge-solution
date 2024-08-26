package de.exxcellent.challenge.interfaces;

import de.exxcellent.challenge.classes.FootballTeam;
import de.exxcellent.challenge.classes.Weather;

import java.io.IOException;
import java.util.List;
interface Reader {
    public List<Weather> readWeatherData(String filePath) throws IOException;
    public List<FootballTeam> readFootballData(String filePath) throws IOException;
}
