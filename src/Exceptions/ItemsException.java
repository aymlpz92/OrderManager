package Exceptions;

public class ItemsException {
    public static boolean itemsE(int items) {
        if  (items > 0) {
            return true;
        } else {
            System.out.println("Error: No items");
            return false;
        }
    }
}
