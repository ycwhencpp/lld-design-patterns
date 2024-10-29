package singeltonDesignPattern;

public class LazyDbConnection {
    static LazyDbConnection dbobj;

    private LazyDbConnection() {

    }

    public static LazyDbConnection getDbConnection() {
        if (dbobj == null) {
            dbobj = new LazyDbConnection();
        }
        return dbobj;
    }
}
