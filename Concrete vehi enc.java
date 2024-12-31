public class Car extends Vehicle {
    private boolean hasGPS;  // Private field

    // Constructor to initialize fields
    public Car(String vehicleId, String model, double baseRentalRate, boolean hasGPS) {
        super(vehicleId, model, baseRentalRate);  // Calling parent constructor
        this.hasGPS = hasGPS;
    }

    // Getter and Setter for hasGPS
    public boolean hasGPS() {
        return hasGPS;
    }

    public void setHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }

    // Overridden methods from Vehicle class
    @Override
    public double calculateRentalCost(int days) {
        double cost = getBaseRentalRate() * days;
        if (hasGPS) {
            cost += 5.00 * days; // Extra cost for GPS
        }
        return cost;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();  // Using the method from parent class to check availability
    }
}

