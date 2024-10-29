package singeltonDesignPattern;

public class LockedDbConnection {
    static LockedDbConnection dbobj;

    private LockedDbConnection() {

    }

    synchronized public static LockedDbConnection getDbConnection() {
        if (dbobj == null) {
            dbobj = new LockedDbConnection();
        }
        return dbobj;
    }
}
