package hotel;

import java.util.Random;

public class Room {
    protected int rmNum;
    protected int maxPpl;
    protected int prcPerNight;
    protected boolean isReserved;

    public Room(int rmNum, int prcPerNight) {
        this.rmNum = rmNum;
        this.prcPerNight = prcPerNight;
        this.maxPpl = new Random().nextInt(4) + 1;
        this.isReserved = false;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public int getRmNum() {
        return rmNum;
    }

    @Override
    public String toString() {
        return "Room{" +
                "№ room =" + rmNum +
                ", capacity=" + maxPpl + " people" +
                ", price (1 night) =" + prcPerNight +
                ", Reserved =" + isReserved +
                '}';
    }
}
