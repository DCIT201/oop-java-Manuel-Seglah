public class Customer {
    private String customerId;          // Private field
    private String name;                // Private field
    private List<RentalTransaction> rentalHistory;  // Private list

    // Constructor
    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        rentalHistory = new ArrayList<>();
    }

    // Getters and Setters for Customer fields
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        // Input validation can be added
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // Input validation can be added
        this.name = name;
    }

    public List<RentalTransaction> getRentalHistory() {
        return new ArrayList<>(rentalHistory);  // Returns a copy for safety
    }

    public void addRentalTransaction(RentalTransaction transaction) {
        rentalHistory.add(transaction);
    }
}
