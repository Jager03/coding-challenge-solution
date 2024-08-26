package de.exxcellent.challenge.classes;

import de.exxcellent.challenge.interfaces.Processor;

import java.util.List;

public class FootballTaskProcessor implements Processor<FootballTeam, String> {
    //method that solves the task of finding team with smallest goal difference
    @Override
    public String solveTask(List<FootballTeam> data) {
        boolean isFirst = true;
        String teamWithSmallestDifference = "";
        int minDifference = 0;

        for (FootballTeam team : data) {
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
