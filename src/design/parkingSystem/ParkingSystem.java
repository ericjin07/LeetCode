package design.parkingSystem;

public class ParkingSystem {

    private int[] spaces;
    public ParkingSystem(int big, int medium, int small) {
        spaces = new int[]{big, medium, small};
    }

    public boolean addCar(int carType) {
        if (carType < 1 || carType > 3) return false;
        return spaces[carType-1]-- > 0;
    }
}
