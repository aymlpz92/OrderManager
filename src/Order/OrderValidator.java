package Order;
import Exceptions.*;

public class OrderValidator {
    public static boolean validate(Order order) {
        return ItemsException.itemsE(order.getItems()) && AmountException.amountE(order.getAmount());
    }
}
