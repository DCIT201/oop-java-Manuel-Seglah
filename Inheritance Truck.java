public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String vehicleId, String model, double baseRentalRate, double loadCapacity) {
        super(vehicleId, model, baseRentalRate);
        this.loadCapacity = loadCapacity;
    }

    
    public double calculateRentalCost(int days) {
        double cost = getBaseRentalRate() * days;
        if (loadCapacity > 1000) { // Additional cost for large trucks
            cost += 30.00 * days;
        }
        return cost;
    }


    public boolean isAvailableForRental() {
        return isAvailable();
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }
}
