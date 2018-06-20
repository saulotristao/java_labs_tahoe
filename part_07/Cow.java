package part_07;

public class Cow extends Mammals {
    private boolean milkProductionOrMeatProduction; // true is for milk production
    private String breed;
    private boolean femaleMale; // true is equal to female

    public Cow(double bodyTemperature, double weight, double height, boolean femaleMale) {
        super(bodyTemperature, weight, height);
        this.femaleMale = femaleMale;
    }

    public void gettingThinner (int weightDecrease){
        super.setWeight(super.getWeight()+weightDecrease);
    }

    public void gettingFatter (int weightIncrease){
        super.setWeight(super.getWeight()+weightIncrease);
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
