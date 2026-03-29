package TaxStrategy;

public class InternationalTax implements Tax {
    @Override
    public double shippingTax(double total) {
        double taxes = total * 0.20;
        System.out.println("Shipping international. Tax: " + taxes);
        return total + taxes;
    }
}
