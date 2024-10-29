package singeltonDesignPattern;

public class DoubleLockedDbConnection {
    volatile static DoubleLockedDbConnection dbobj;

    private DoubleLockedDbConnection() {

    }

    public static DoubleLockedDbConnection gDbConnection() {
        if (dbobj == null) {
            synchronized (DoubleLockedDbConnection.class) {
                if (dbobj == null) {
                    dbobj = new DoubleLockedDbConnection();
                }
            }
        }
        return dbobj;
    }
}
