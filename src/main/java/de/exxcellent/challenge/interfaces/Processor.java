package de.exxcellent.challenge.interfaces;

import de.exxcellent.challenge.classes.Weather;
import de.exxcellent.challenge.classes.FootballTeam;

import java.util.List;

public interface Processor {
    public int findDayWithSmallestSpread(List<Weather> weatherData);
    public String findTeamWithSmallestGoalDifference(List<FootballTeam> footballData);
}
