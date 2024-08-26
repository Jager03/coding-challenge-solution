package de.exxcellent.challenge.classes;

import de.exxcellent.challenge.interfaces.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReaderCSV implements Reader {
    // Method that reads the weather data necessary for solving the task and returns a list of Weather objects
    @Override
    public List<Weather> readWeatherData(String filePath) throws IOException {
        List<Weather> weatherData = new ArrayList<>();

        //getting the max temp and min temp from the csv and storing it in the Weather array
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine(); // Skip header line
            String line;

            //get the min and max temperature from the csv and storing them in a Weather object adding it to weatherData array
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                int day = Integer.parseInt(values[0].trim());
                double maxTemp = Double.parseDouble(values[1].trim());
                double minTemp = Double.parseDouble(values[2].trim());
                weatherData.add(new Weather(day, maxTemp, minTemp));
            }
        }
        return weatherData;
    }

    // Method that reads the football team data necessary for solving the task and returns a list of FootballTeam objects
    @Override
    public List<FootballTeam> readFootballData(String filePath) throws IOException {
        List<FootballTeam> footballData = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine(); // Skip header line
            String line;

            //get the goals and goalsAllowed from the csv and storing them as a FootballTeam object adding it to the footballData array
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                String teamName = values[0].trim();
                int goals = Integer.parseInt(values[5].trim());
                int goalsAllowed = Integer.parseInt(values[6].trim());
                footballData.add(new FootballTeam(teamName, goals, goalsAllowed));
            }
        }
        return footballData;
    }
}
