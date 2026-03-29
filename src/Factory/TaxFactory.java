package Factory;
import Enum.TaxRate;
import TaxStrategy.InternationalTax;
import TaxStrategy.NationalTax;
import TaxStrategy.Tax;

public class TaxFactory {
    public static Tax create(TaxRate taxRate) {
        return switch (taxRate) {
            case NATIONAL -> new NationalTax();
            case INTERNATIONAL -> new InternationalTax();
        };
    }
}
