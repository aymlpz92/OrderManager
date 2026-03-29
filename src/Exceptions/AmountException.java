package Exceptions;

public class AmountException {
    public static boolean amountE(double amount) {
        if (amount > 0) {
            return true;
        } else {
            System.out.println("Error: Amount is zero or less");
            return false;
        }
    }
}
