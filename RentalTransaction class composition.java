public class RentalTransaction {
    private Vehicle vehicle;
    private Customer customer;
    private int rentalDays;
    private double totalCost;

    public RentalTransaction(Vehicle vehicle, Customer customer, int rentalDays) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.rentalDays = rentalDays;
        this.totalCost = vehicle.calculateRentalCost(rentalDays);
    }

    public double getTotalCost() {
        return totalCost;
    }
}

