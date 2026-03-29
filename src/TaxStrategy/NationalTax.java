package TaxStrategy;

public class NationalTax implements Tax {

    @Override
    public double shippingTax(double total) {
        double taxes = total * 0.05;
        System.out.println("National shipping. Tax: " + taxes);
        return taxes;
    }
}
