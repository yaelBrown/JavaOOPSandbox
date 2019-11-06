public class Ford extends Car {
    private final String manufacturer = "Ford";
    private int numEngineCyls;
    private int numDoors;
    private int numSeats;
    private final Boolean isEngineInFront = true;

    public String getManufacturer() {
        return manufacturer;
    }

    public int getNumEngineCyls() {
        return numEngineCyls;
    }

    public void setNumEngineCyls(int numEngineCyls) {
        this.numEngineCyls = numEngineCyls;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }
    public Boolean getEngineInFront() {
        return isEngineInFront;
    }

}