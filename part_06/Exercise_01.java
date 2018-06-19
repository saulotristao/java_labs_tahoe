package part_06;

/*
*Demonstrate inheritance using 1 super class and 2 subclasses. Each class must be in it's own file.
 */

class Bar{

    public static void main(String[] args) {
        Scotch jonny = new Scotch(40, 900, "Scotland", "corn", "Edi");
        System.out.println(jonny.alcoholInBottle());

    }

}

class HardLiqours {
    private double percentageOfAlcohol;
    private double bottleSize;
    private String country;
    private String type;

    public HardLiqours(double percentageOfAlcohol, double bottleSize, String country) {
        this.percentageOfAlcohol = percentageOfAlcohol;
        this.bottleSize = bottleSize;
        this.country = country;
    }

    public HardLiqours(String country, String type) {
        this.country = country;
        this.type = type;
    }

    public HardLiqours(double percentageOfAlcohol, double bottleSize) {
        this.percentageOfAlcohol = percentageOfAlcohol;
        this.bottleSize = bottleSize;
    }

    public HardLiqours(double bottleSize, String country) {
        this.bottleSize = bottleSize;
        this.country = country;
    }

    public StringBuilder typeCountry (String country, String type){
        StringBuilder sb = new StringBuilder();
        sb.append("This liqour is ");
        sb.append(type);
        sb.append(" and is from ");
        sb.append(country);
        return sb;
    }
    public double alcoholInBottle (){
        return percentageOfAlcohol*bottleSize;
    }


    public double getPercentageOfAlcohol() {
        return percentageOfAlcohol;
    }

    public void setPercentageOfAlcohol(double percentageOfAlcohol) {
        this.percentageOfAlcohol = percentageOfAlcohol;
    }

    public double getBottleSize() {
        return bottleSize;
    }

    public void setBottleSize(double bottleSize) {
        this.bottleSize = bottleSize;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

class Vodka extends HardLiqours{
    private String destilingMethod;
    private String typeOfGrain;

    public Vodka(double percentageOfAlcohol, double bottleSize, String country, String destilingMethod, String typeOfGrain) {
        super(percentageOfAlcohol, bottleSize, country);
        super.setType("Vodka");
        this.destilingMethod = destilingMethod;
        this.typeOfGrain = typeOfGrain;
    }
}

class Whisky extends HardLiqours{

    private String bourbonOrScotch;
    private String typeOfGrain;

    public Whisky(double percentageOfAlcohol, double bottleSize, String country, String bourbonOrScotch, String typeOfGrain) {
        super(percentageOfAlcohol, bottleSize, country);
        super.setType("Whisky");
        this.bourbonOrScotch = bourbonOrScotch;
        this.typeOfGrain = typeOfGrain;
    }

    public Whisky(double percentageOfAlcohol, double bottleSize, String country, String typeOfGrain) {
        super(percentageOfAlcohol, bottleSize, country);
        this.typeOfGrain = typeOfGrain;
    }

    public String getBourbonOrScotch() {
        return bourbonOrScotch;
    }

    public void setBourbonOrScotch(String bourbonOrScotch) {
        this.bourbonOrScotch = bourbonOrScotch;
    }

    @Override
    public double alcoholInBottle() {
        return (getPercentageOfAlcohol() * getBottleSize()+ 200);
    }

    public String getTypeOfGrain() {
        return typeOfGrain;
    }

    public void setTypeOfGrain(String typeOfGrain) {
        this.typeOfGrain = typeOfGrain;
    }
}

class Scotch extends Whisky{
    private String areaOfScotland;

    public Scotch(double percentageOfAlcohol, double bottleSize, String country, String typeOfGrain, String areaOfScotland) {
        super(percentageOfAlcohol, bottleSize, country, typeOfGrain);
        super.setBourbonOrScotch("Scotch");
        this.areaOfScotland = areaOfScotland;
    }
}

