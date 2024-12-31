public abstract class Vehicle {
    private String vehicleId;         // Private field
    private String model;             // Private field
    private double baseRentalRate;    // Private field
    private boolean isAvailable;      // Private field

    // Constructor with validation
    public Vehicle(String vehicleId, String model, double baseRentalRate) {
        this.vehicleId = vehicleId;
        this.model = model;
        setBaseRentalRate(baseRentalRate);  // Calls setter with validation
        this.isAvailable = true;           // Default is available for rental
    }

    // Getters and Setters with validation

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        // Setter with validation (e.g., must not be null or empty)
        if (vehicleId == null || vehicleId.isEmpty()) {
            throw new IllegalArgumentException("Vehicle ID cannot be null or empty.");
        }
        this.vehicleId = vehicleId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        // Setter with validation (e.g., model name cannot be empty)
        if (model == null || model.isEmpty()) {
            throw new IllegalArgumentException("Model cannot be null or empty.");
        }
        this.model = model;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public void setBaseRentalRate(double baseRentalRate) {
        // Setter with validation (e.g., rental rate must be non-negative)
        if (baseRentalRate < 0) {
            throw new IllegalArgumentException("Base rental rate cannot be negative.");
        }
        this.baseRentalRate = baseRentalRate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        // Setter to update availability (e.g., based on rental status)
        this.isAvailable = isAvailable;
    }

    // Abstract methods that will be implemented by subclasses
    public abstract double calculateRentalCost(int days);
    public abstract boolean isAvailableForRental();
}
