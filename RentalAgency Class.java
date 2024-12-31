public class RentalAgency {
    private List<Vehicle> vehicleFleet;

    public RentalAgency() {
        vehicleFleet = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleFleet.add(vehicle);
    }

    public Vehicle getAvailableVehicle(String vehicleType) {
        for (Vehicle vehicle : vehicleFleet) {
            if (vehicle.isAvailableForRental()) {
                return vehicle;
            }
        }
        return null; // No available vehicles
    }
}

