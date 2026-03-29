package Order;

import DatabaseStrategy.Database;
import DiscountStrategy.Client;
import Factory.ClientFactory;
import Factory.DatabaseFactory;
import Factory.NotificationFactory;
import Factory.TaxFactory;
import NotificationStrategy.Notification;
import TaxStrategy.Tax;
import Enum.*;

public class OrderManager {
    private Client client;
    private Tax tax;
    private Database db;
    private Notification notif;

    public OrderManager(ClientType client, TaxRate tax, DatabaseType db, NotificationType notif) {
        this.client = ClientFactory.create(client);
        this.tax = TaxFactory.create(tax);
        this.db = DatabaseFactory.create(db);
        this.notif = NotificationFactory.create(notif);
    }


    public void process() {
        Order order = new Order(4, 1600);
        boolean validator = OrderValidator.validate(order);
        if (validator) {
            double total = client.discount(order.getAmount());
            total += tax.shippingTax(total);
            db.connectDB(total, client);
            notif.sendMessage();
        }
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Notification getNotif() {
        return notif;
    }

    public void setNotif(Notification notif) {
        this.notif = notif;
    }

    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    public Database getDb() {
        return db;
    }

    public void setDb(Database db) {
        this.db = db;
    }
}
