package DiscountStrategy;
import Enum.ClientType;

public class NewClient implements Client {

    @Override
    public double discount(double amount) {
        double d = 0.0;
        d = amount * 0.15;
        return amount - d;
    }
}
