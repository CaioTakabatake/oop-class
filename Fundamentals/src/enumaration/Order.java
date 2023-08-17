package enumaration;

public class Order {
    private String description;
    private double amount;
    private String status;

    public Order(String description, double amount, String status) {
        this.description = description;
        this.amount = amount;
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" + "description=" + description + ", amount=" + amount + ", status=" + status + '}';
    }

}
