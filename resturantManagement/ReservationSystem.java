package resturantManagement;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ReservationSystem {
    static ReservationSystem reservationSystem;
    HashMap<Integer, Reservation> reservationMap;
    HashSet<Restuarant> restuarants;
    static int counter = 0;

    private ReservationSystem() {
        this.reservationMap = new HashMap<>();
        restuarants = new HashSet<>();
    }

    public static ReservationSystem getInstance() {
        if (reservationSystem == null) {
            reservationSystem = new ReservationSystem();
        }
        return reservationSystem;
    }

    public Reservation makeReservation(User user, Restuarant restuarant) {
        List<Table> tables = restuarant.getAvialiableTables();
        boolean areTablesAvailiable = tables.size() > 0;
        if (!areTablesAvailiable) {
            System.out.println("Sorry restuanrnt is out of table ");
            return null;
        }
        Table table = tables.get(tables.size() - 1);
        Reservation reservation = new Reservation(counter++, ReservationStatus.ACTIVE, user, table, restuarant);
        reservationMap.put(reservation.getId(), reservation);
        return reservation;
    }

    public void cancelReservation(int reservationId) {
        if (reservationMap.containsKey(reservationId)) {
            Reservation reservation = reservationMap.get(reservationId);
            reservation.updateStatus(ReservationStatus.CANCELLED);
            System.out.println("Reservation " + reservationId + " has been canceled.");
        } else {
            System.out.println("Reservation not found.");
        }
    }
}
