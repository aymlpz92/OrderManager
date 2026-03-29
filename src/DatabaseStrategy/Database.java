package DatabaseStrategy;

import DiscountStrategy.Client;

public interface Database {
    public void connectDB(double total, Client client);
}
