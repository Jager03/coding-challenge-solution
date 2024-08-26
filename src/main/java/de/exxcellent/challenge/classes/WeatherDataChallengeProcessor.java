package de.exxcellent.challenge.classes;

import de.exxcellent.challenge.interfaces.Processor;

import java.util.List;

public class WeatherDataChallengeProcessor implements Processor {
    //method that solves the task of finding the day with smallest spread
    @Override
    public int findDayWithSmallestSpread(List<Weather> weatherData) {
        boolean isFirst = true;
        int dayWithSmallestSpread = -1;
        double minSpread = 0.0;

        for (Weather weather : weatherData) {
            double spread = weather.getTemperatureSpread();

            //if block to save the first calculated spread in dayWithSmallestSpread variable
            if(isFirst){
                minSpread = spread;
                dayWithSmallestSpread = weather.getDay();   //in case the first day has the smallest spread
                isFirst = false;
                continue;
            }

            //check if new spread is smaller than the old value
            if (spread < minSpread) {
                minSpread = spread;
                dayWithSmallestSpread = weather.getDay();
            }
        }

        return dayWithSmallestSpread;
    }

    //method that solves the task of finding team with smallest goal difference
    @Override
    public String findTeamWithSmallestGoalDifference(List<FootballTeam> footballData) {
        boolean isFirst = true;
        String teamWithSmallestDifference = "";
        int minDifference = 0;

        for (FootballTeam team : footballData) {
            int difference = team.getGoalDifference();

            //if block to save the first calculated difference in minDifference variable
            if(isFirst){
                minDifference = difference;
                teamWithSmallestDifference = team.getName();    //saving the name in case the first team has the smallest difference
                isFirst = false;
                continue;
            }

            //check if new difference is smaller than the old value
            if (difference < minDifference) {
                minDifference = difference;
                teamWithSmallestDifference = team.getName();
            }
        }

        return teamWithSmallestDifference;
    }
}
