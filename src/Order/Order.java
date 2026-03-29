package Order;

public class Order {
    private int items;
    private double amount;


    public Order(int items, double amount) {
        this.items = items;
        this.amount = amount;
    }

    public int getItems() {
        return items;
    }
    public void setItems(int items) {
        this.items = items;
    }
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


}
