public void rent(Customer customer, int days) {
    // Rent logic specific to Car
    System.out.println("Car rented by " + customer.getName() + " for " + days + " days.");
}

public void returnVehicle() {
    // Return logic specific to Car
    setAvailable(true);
    System.out.println("Car returned.");
}
