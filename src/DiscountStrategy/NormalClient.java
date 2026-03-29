package DiscountStrategy;

public class NormalClient implements Client {

    @Override
    public double discount(double amount) {
        double d = 0.0;
        if (amount > 1000) {
            d = amount * 0.05;
        } else {
            d = 0.0;
        }
        return amount - d;
    }
}
