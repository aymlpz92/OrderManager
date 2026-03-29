import Order.OrderManager;
import Enum.*;


public class Main {
    public static void main(String[] args) {

        OrderManager om = new OrderManager(ClientType.VIP, TaxRate.NATIONAL, DatabaseType.MYSQL, NotificationType.EMAIL);
        om.process();
    }
}