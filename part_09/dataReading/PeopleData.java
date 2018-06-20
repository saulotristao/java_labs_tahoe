package part_09.dataReading;

public class PeopleData {

    private int index;
    private double heightInches;
    private double weightPounds;

    // Each person will have a "Index", "Height(Inches)", "Weight(Pounds)"
    public PeopleData(int index, double heightInches, double weightPounds) {
        this.index = index;
        this.heightInches = heightInches;
        this.weightPounds = weightPounds;
    }

    // generic Construtor

    public PeopleData() {
    }

    public double getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public double getHeightInches() {
        return heightInches;
    }

    public void setHeightInches(double heightInches) {
        this.heightInches = heightInches;
    }

    public double getWeightPounds() {
        return weightPounds;
    }

    public void setWeightPounds(double weightPounds) {
        this.weightPounds = weightPounds;
    }

    @Override
    public String toString() {
        return "PeopleData{" +
                "index=" + index +
                ", heightInches=" + heightInches +
                ", weightPounds=" + weightPounds +
                '}';
    }
}
