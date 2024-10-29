package resturantManagement;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReservationSystem reservationSystem = ReservationSystem.getInstance();
        Table table = new Table(1, 4, false);
        Table table2 = new Table(2, 4, false);
        Table table3 = new Table(3, 4, false);
        List<Table> tables = new ArrayList<>();
        tables.add(table);
        tables.add(table2);
        tables.add(table3);

        Restuarant restuarant = new Restuarant(1, "abc", tables);

        User user = new User(1, "anurag", "instamart");

        Reservation reservation = reservationSystem.makeReservation(user, restuarant);

        reservation.display();

    }
}
