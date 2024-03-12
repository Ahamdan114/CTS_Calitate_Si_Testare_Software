package Singleton;

public class DatabaseConnection {

    private static volatile DatabaseConnection instance;
    private DatabaseConnection() {}

    public static DatabaseConnection getInstance() {
        if(DatabaseConnection.instance == null)
            synchronized (DatabaseConnection.class) {
                instance = new DatabaseConnection();
            }
        return DatabaseConnection.instance;
    }
}
