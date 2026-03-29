package DiscountStrategy;

public class VIPClient implements Client {

    @Override
    public double discount(double amount) {
        double d = 0.0;
        if (amount > 1000) {
            d = amount * 0.20;
        } else {
            d = amount * 0.10;
        }
        return amount - d;
    }
}
