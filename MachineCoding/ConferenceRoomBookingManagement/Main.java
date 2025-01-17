package MachineCoding.ConferenceRoomBookingManagement;
import MachineCoding.*;

public class Main {
    public static void main(String[] args) {
        try {
            ConfernceRoomSystem system = ConfernceRoomSystem.getConfernceRoomSystemInstance();
            
            system.addBuilding("b1");
            system.addFloor("b1", 1);
            
            system.addConferenceRoom("c1", 1, "b1", RoomType.SMALL);
            system.addConferenceRoom("c2", 1, "b1", RoomType.MEDIUM);
            system.addConferenceRoom("c3", 1, "b1", RoomType.LARGE);
            
            system.setBookingStrategy(new StandardBookingStrategy());
            
            try {
                system.bookRoom("6:8", "b1", 1, "c1");  // 6am-8am
            } catch (Exception e) {
                System.out.println("Failed to book outside working hours: " + e.getMessage());
            }
            
            system.setBookingStrategy(new FlexibleBookingStrategy());
            
            system.bookRoom("6:8", "b1", 1, "c1");  // 6am-8am
            
            system.listRooms();
            system.listBookings();
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}