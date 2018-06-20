package part_07;

public class RacingHorse extends Horse{
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
