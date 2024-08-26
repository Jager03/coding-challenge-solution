package de.exxcellent.challenge;

import de.exxcellent.challenge.classes.*;
import de.exxcellent.challenge.classes.WeatherTaskProcessor;
import de.exxcellent.challenge.classes.FootballTaskProcessor;

import java.io.IOException;
import java.util.List;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */

public final class App {
    public static void runWeatherTask(String filePath, DataReaderCSV dataReaderCSV, WeatherTaskProcessor weatherTaskProcessorProcessor) throws IOException{
        List<Weather> weatherData = dataReaderCSV.readWeatherData(filePath);
        int dayWithSmallestTempSpread = weatherTaskProcessorProcessor.solveTask(weatherData);

        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);
    }

    public static void runFootballTask(String filePath, DataReaderCSV dataReaderCSV, FootballTaskProcessor footballTaskProcessor) throws IOException{
        List<FootballTeam> footballData = dataReaderCSV.readFootballData(filePath);
        String teamWithSmallestGoalSpread = footballTaskProcessor.solveTask(footballData);

        System.out.printf("Team with smallest goal spread : %s%n", teamWithSmallestGoalSpread);
    }

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */

    public static void main(String... args) {

        //Relative path
        String BASE_FILE_PATH = "src/main/resources/de/exxcellent/challenge/";

        //Initialize components
        DataReaderCSV dataReaderCSV = new DataReaderCSV();
        WeatherTaskProcessor weatherTaskProcessor = new WeatherTaskProcessor();
        FootballTaskProcessor footballTaskProcessor = new FootballTaskProcessor();

        //Check if there are at least two arguments
        if (args.length < 2) {
            System.out.println("Not enough arguments provided.");
            return;
        }

        //Extract arguments
        String command = args[0];
        String fileName = args[1];

        //Run code depending on the arguments
        try{
            String filePath = BASE_FILE_PATH + fileName;                            //build the filePath

            if("--football".equals(command)){
                runFootballTask(filePath, dataReaderCSV, footballTaskProcessor);
            }
            else if ("--weather".equals(command)) {
                runWeatherTask(filePath, dataReaderCSV, weatherTaskProcessor);
            }
            else {
                System.out.printf("Command %s is unknown!", command);
            }
        } catch (IOException e){
            System.out.print(e.toString());
        }
    }
}
