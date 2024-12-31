public class Inheritance {
    
}
public class Car extends Vehicle {
    private boolean hasGPS;

    public Car(String vehicleId, String model, double baseRentalRate, boolean hasGPS) {
        super(vehicleId, model, baseRentalRate);
        this.hasGPS = hasGPS;
    }

    public double calculateRentalCost(int days) {
        double cost = getBaseRentalRate() * days;
        if (hasGPS) {
            cost += 5.00 * days; // GPS costs an extra $5 per day
        }
        return cost;
    }

    public boolean isAvailableForRental() {
        return isAvailable();
    }

    public boolean hasGPS() {
        return hasGPS;
    }
}
