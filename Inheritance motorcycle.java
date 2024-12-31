public class Motorcycle extends Vehicle {
    private boolean isHelmetIncluded;

    public Motorcycle(String vehicleId, String model, double baseRentalRate, boolean isHelmetIncluded) {
        super(vehicleId, model, baseRentalRate);
        this.isHelmetIncluded = isHelmetIncluded;
    }

    
    public double calculateRentalCost(int days) {
        double cost = getBaseRentalRate() * days;
        if (isHelmetIncluded) {
            cost += 2.50 * days; // Helmet is an additional cost of $2.50 per day
        }
        return cost;
    }

    
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    public boolean isHelmetIncluded() {
        return isHelmetIncluded;
    }
}

