package Factory;

import DiscountStrategy.Client;
import DiscountStrategy.NewClient;
import DiscountStrategy.NormalClient;
import DiscountStrategy.VIPClient;
import Enum.ClientType;

public class ClientFactory {
    public static Client create(ClientType Type) {
        return switch (Type) {
            case VIP -> new VIPClient();
            case NORMAL -> new NormalClient();
            case NEW -> new NewClient();
        };
    }
}
