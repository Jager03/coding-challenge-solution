package de.exxcellent.challenge.classes;

public class FootballTeam {
    private String name;
    private int goals;
    private int goalsAllowed;

    public FootballTeam(String name, int goals, int goalsAllowed) {
        this.name = name;
        this.goals = goals;
        this.goalsAllowed = goalsAllowed;
    }

    public String getName() {
        return name;
    }

    public int getGoals() {
        return goals;
    }

    public int getGoalsAllowed() {
        return goalsAllowed;
    }

    public int getGoalDifference() {
        return Math.abs(goals - goalsAllowed);
    }
}
