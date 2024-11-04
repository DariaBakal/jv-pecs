package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int cargoCapacity;

    public Truck() {
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
