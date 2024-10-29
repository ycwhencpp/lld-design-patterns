package resturantManagement;

public class Table {
    private int id;
    private int capacity;
    private boolean isReserved;

    public Table(int id, int c, boolean r) {

        this.id = id;
        this.capacity = c;
        this.isReserved = r;

    }

    public boolean isReserved() {
        return isReserved;
    }

    public void reserveTable() {
        isReserved = true;
    }

    public void releaseTable() {
        isReserved = false;
    }
}
