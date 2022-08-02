package designParkingSystem;

public class DesignParkingSystem {
    int big, medium, small;

    public DesignParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1 && big > 0) {
            this.big--;
            return true;
        } else if (carType == 2 && medium > 0) {
            this.medium--;
            return true;
        } else if (carType == 3 && small > 0) {
            this.small--;
            return true;
        } else return false;
    }

}
