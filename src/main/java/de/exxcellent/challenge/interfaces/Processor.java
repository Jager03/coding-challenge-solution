package de.exxcellent.challenge.interfaces;

import de.exxcellent.challenge.classes.Weather;
import de.exxcellent.challenge.classes.FootballTeam;

import java.util.List;

public interface Processor<T, R>{
    public R solveTask(List<T> data);
}
