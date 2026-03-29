package DatabaseStrategy;

import DiscountStrategy.Client;

public class MySQL implements Database{
    @Override
    public void connectDB(double total, Client client) {
        System.out.println("Connecting to database jdbc:mysql://localhost:3306/shop...");
        System.out.println("INSERT INTO orders (total, type) VALUES (" + total + ", '" + client + "')");
    }
}
