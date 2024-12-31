public class Customer {
    private String customerId;
    private String name;
    private List<RentalTransaction> rentalHistory;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.rentalHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addRentalTransaction(RentalTransaction transaction) {
        rentalHistory.add(transaction);
    }
}
