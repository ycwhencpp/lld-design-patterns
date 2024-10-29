package resturantManagement;

public class Reservation {
    int id;
    ReservationStatus status;
    User user;
    Table table;
    Restuarant restuarant;

    public Reservation(int id, ReservationStatus status, User user, Table table, Restuarant restuarant) {
        this.id = id;
        this.status = status;
        this.user = user;
        this.table = table;
        this.restuarant = restuarant;
    }

    public void updateStatus(ReservationStatus status) {
        this.status = status;
        if (status == ReservationStatus.CANCELLED || status == ReservationStatus.COMPLETED) {
            table.releaseTable();
        }
    }

    public int getId() {
        return this.id;
    }

    public void display() {
        System.out.println("Reservation of User" + user.getDetails() + "confiremd for table with restuant "
                + restuarant.getInfo());
    }

}
