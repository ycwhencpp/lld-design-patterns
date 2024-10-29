package singeltonDesignPattern;

/**
 * EagerDbConnection
 */
public class EagerDbConnection {
    static EagerDbConnection dbobj = new EagerDbConnection();

    private EagerDbConnection() {

    }

    public static EagerDbConnection getDbConnection() {
        return dbobj;
    }
}