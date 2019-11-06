public class Car {
    private final int NumOfWheels = 4;
    private final boolean EnginePresent = true;
    private int hp;

    public int getNumOfWheels() {
        return NumOfWheels;
    }

    public boolean isEnginePresent() {
        return EnginePresent;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getTq() {
        return tq;
    }

    public void setTq(int tq) {
        this.tq = tq;
    }

    private int tq;
}