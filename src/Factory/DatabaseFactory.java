package Factory;
import DatabaseStrategy.Database;
import DatabaseStrategy.MySQL;
import Enum.DatabaseType;

public class DatabaseFactory {
    public static Database create(DatabaseType dbType) {
        return switch (dbType) {
            case MYSQL -> new MySQL();
        };
    }
}
