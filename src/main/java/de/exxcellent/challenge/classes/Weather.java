package de.exxcellent.challenge.classes;

public class Weather {
    private int day;
    private double maxTemp;
    private double minTemp;

    public Weather(int day, double maxTemp, double minTemp) {
        this.day = day;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
    }

    public int getDay() {
        return day;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public double getTemperatureSpread() {
        return maxTemp - minTemp;
    }
}
