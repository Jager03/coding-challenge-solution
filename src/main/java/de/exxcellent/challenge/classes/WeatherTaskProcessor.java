package de.exxcellent.challenge.classes;

import de.exxcellent.challenge.interfaces.Processor;

import java.util.List;

public class WeatherTaskProcessor implements Processor<Weather, Integer> {
    //method that solves the task of finding the day with smallest spread
    @Override
    public Integer solveTask(List<Weather> data) {
        boolean isFirst = true;
        int dayWithSmallestSpread = -1;
        double minSpread = 0.0;

        for (Weather weather : data) {
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
}
