public abstract class Vehicle {
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    // Constructor with validation
    public Vehicle(String vehicleId, String model, double baseRentalRate) {
        this.vehicleId = vehicleId;
        this.model = model;
        setBaseRentalRate(baseRentalRate);
        this.isAvailable = true;
    }

    // Getters and Setters with input validation
    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public void setBaseRentalRate(double baseRentalRate) {
        if (baseRentalRate < 0) {
            throw new IllegalArgumentException("Base rental rate cannot be negative.");
        }
        this.baseRentalRate = baseRentalRate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Abstract methods
    public abstract double calculateRentalCost(int days);
    public abstract boolean isAvailableForRental();
}
