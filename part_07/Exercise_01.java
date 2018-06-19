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

class RacingHorse extends Horse{
    private boolean isRacing;
    private double nextRace;
    private String whoIsJockey;

    public RacingHorse(double bodyTemperature, double weight, double height, boolean femaleMale, boolean isRacing) {
        super(bodyTemperature, weight, height, femaleMale);
        this.isRacing = isRacing;
    }

    public boolean isRacing() {
        return isRacing;
    }

    public void setRacing(boolean racing) {
        isRacing = racing;
    }

    public double getNextRace() {
        return nextRace;
    }

    public void setNextRace(double nextRace) {
        this.nextRace = nextRace;
    }

    public String getWhoIsJockey() {
        return whoIsJockey;
    }

    public void setWhoIsJockey(String whoIsJockey) {
        this.whoIsJockey = whoIsJockey;
    }
}


class Cows extends Mammals {
    private boolean milkProductionOrMeatProduction; // true is for milk production
    private String breed;
    private boolean femaleMale; // true is equal to female

    public Cows(double bodyTemperature, double weight, double height, boolean femaleMale) {
        super(bodyTemperature, weight, height);
        this.femaleMale = femaleMale;
    }

    public double gettingThinner(int weightDecrease) {
        return super.getWeight() + weightDecrease;
    }

    public double gettingFatter(int weightIncrease) {
        return super.getWeight() + weightIncrease;
    }

    public boolean iSleeping(int hourOfDay) {
        if (hourOfDay < 7 || hourOfDay > 22) {
            return true;
        }
        return false;
    }

    public boolean isMilkProductionOrMeatProduction() {
        return milkProductionOrMeatProduction;
    }

    public void setMilkProductionOrMeatProduction(boolean milkProductionOrMeatProduction) {
        this.milkProductionOrMeatProduction = milkProductionOrMeatProduction;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isFemaleMale() {
        return femaleMale;
    }

    public void setFemaleMale(boolean femaleMale) {
        this.femaleMale = femaleMale;
    }
}

class Horse extends Mammals {
    private double maxSpeed;
    private String breed;
    private boolean femaleMale; // true is equal to female

    public Horse(double bodyTemperature, double weight, double height, boolean femaleMale) {
        super(bodyTemperature, weight, height);
        this.femaleMale = femaleMale;
    }

    public double gettingThinner (int weightDecrease){
        return super.getWeight()+weightDecrease;
    }

    public double gettingFatter (int weightIncrease){
        return  super.getWeight()+weightIncrease;
    }

    public boolean iSleeping (int hourOfDay){
        if(hourOfDay < 7 || hourOfDay > 22 ){
            return true;
        }
        return false;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isFemaleMale() {
        return femaleMale;
    }

    public void setFemaleMale(boolean femaleMale) {
        this.femaleMale = femaleMale;
    }
}


class Mammals implements Animal{
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

