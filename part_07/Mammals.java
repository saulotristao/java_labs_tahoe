package part_07;
/*
Create the following:

1) Write one super class with at least 3 private instance variables and at least 3 public methods
2) Write three subclasses (with at least 3 methods each that not getters and setters) that extend the super
class. Make sure each subclass can manipulate the private variables in the super class. One subclass should
extend another subclass which extends the super class. Each subclass should only have variables and methods
that apply to that subclass, ie Animal -> Mammal -> Whale.
3) Make use of the keyword "super" in at least two constructors.
4) Write an interface with at least 3 methods. Have the superclass implement this interface.
*/


public class Mammals implements Animal{
    private double bodyTemperature;
    private double pregnancyTime;
    private String hairColor;
    private double weight;
    private double height;
    private boolean isAlive;
    private String country;
    private double temperatureOfSurviving;

    @Override
    public boolean isAlive() {
        return this.isAlive;
    }

    @Override
    public String whereLives() {
        return this.country;
    }

    @Override
    public boolean survivesInColdWeather(double currentTemperature) {
        if (currentTemperature<this.temperatureOfSurviving){
            return false;
        }
        return true;
    }

    public Mammals(double bodyTemperature, double weight, double height) {
        this.bodyTemperature = bodyTemperature;
        this.weight = weight;
        this.height = height;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getTemperatureOfSurviving() {
        return temperatureOfSurviving;
    }

    public void setTemperatureOfSurviving(double temperatureOfSurviving) {
        this.temperatureOfSurviving = temperatureOfSurviving;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(double bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    public double getPregnancyTime() {
        return pregnancyTime;
    }

    public void setPregnancyTime(double pregnancyTime) {
        this.pregnancyTime = pregnancyTime;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
}

