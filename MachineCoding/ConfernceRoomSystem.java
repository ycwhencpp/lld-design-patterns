package MachineCoding;

import java.util.*;

public class ConfernceRoomSystem {
    private static volatile ConfernceRoomSystem instance;
    private Map<String, Building> buildings;
    private BookingStartegy bookingStrategy;
    private RoomFactory roomFactory;

    private ConfernceRoomSystem() {
        this.buildings = new HashMap<>();
        this.bookingStrategy = new StandardBookingStrategy();
        this.roomFactory = new ConferenceRoomfactory();
    }

    public static ConfernceRoomSystem getConfernceRoomSystemInstance(){

        if(instance==null){
            synchronized(ConfernceRoomSystem.class){
                if(instance == null){
                    instance = new ConfernceRoomSystem();
                }   
            }
        }
        return instance;
    }

    public void setBookingStrategy(BookingStartegy bookingStrategy){
        this.bookingStrategy = bookingStrategy;
    }

    public void addBuilding(String builidingId){
        this.buildings.putIfAbsent(builidingId, new Building(builidingId));
        System.out.println("Added building " + builidingId + " into the system.");

    }
    public void addFloor(String buildingId, int floorNumber)  {
        Building building = buildings.get(buildingId);
        if (building == null) {
            System.out.println("Incorrect bulidng id");
        }
        building.addFloor(floorNumber);
        System.out.println("Added floor " + floorNumber + " in building " + buildingId);
    }

    // <buildingName> <floorName> <conferenceRoomID>
    public void addConferenceRoom(String roomId, int floorNumber, String buildingId, RoomType roomType) {
        Building building = buildings.get(buildingId);
        if(building == null){
            System.out.println("Invalid Building Id");
        }
        Floor floor = building.getFloor(floorNumber);
        if(floor == null) {
            System.out.println("Invalid Floor Id");
        }
        ConferenceRoom room = roomFactory.createRoom(roomId, roomType);
        floor.addConferenceRoom(room);
        System.out.println("Added " + roomType + " conference room " + roomId + 
        " in floor " + floorNumber + " of building " + buildingId);
    }

    public void bookRoom(String slot, String buildingId, int floorNumber, String roomId){
        Building building = buildings.get(buildingId);
        if(building == null){
            System.out.println("Invalid Building Id");
        }
        Floor floor = building.getFloor(floorNumber);
        if(floor == null) {
            System.out.println("Invalid Floor Id");
        }

        ConferenceRoom room = floor.getConferenceRoom(roomId);

        if(room == null){
            System.out.println("Invalid ROom id ");
        }

        String[] times = slot.split(":");
        TimeSlot timeSlot = new TimeSlot(Integer.parseInt(times[0]), Integer.parseInt(times[1])); 

        if(!bookingStrategy.isValidBooking(timeSlot)){
            System.out.println("Invalid TIme slot ");
        }

        room.bookSlot(timeSlot);
        System.out.println("Booked room " + roomId + " for slot " + slot);

    }

    public void listRooms() {
        for(Building building: buildings.values()){
            for(Floor floor: building.getAllFloors()){
                for(ConferenceRoom room : floor.getAllRooms()){
                    System.out.println(room.getRoomId() + ", ");
                }
            }
        }
    }


    public void cancelBooking(String slotStr, String buildingId, int floorNumber, String roomId)  {
        String[] times = slotStr.split(":");
        TimeSlot slot = new TimeSlot(Integer.parseInt(times[0]), Integer.parseInt(times[1]));
        
        Building building = buildings.get(buildingId);
        if (building == null){
             System.out.println("Invalid Building");
             return;
        } 
        
        Floor floor = building.getFloor(floorNumber);
        if (floor == null) {
            System.out.println("Invalid floor");
             return;
        }
        
        ConferenceRoom room = floor.getConferenceRoom(roomId);
        if (room == null) {
            System.out.println("Invalid room");
             return;
        }
        
        room.cancelBooking(slot);
        System.out.println("Cancelled booking for room " + roomId + " for slot " + slot);
    }


    public void listBookings() {
        for (Building building : buildings.values()) {
            for (Floor floor : building.getAllFloors()) {
                for (ConferenceRoom room : floor.getAllRooms()) {
                    for (TimeSlot slot : room.getBookedSlots()) {
                        System.out.println(slot.getTime());
                    }
                }
            }
        }
    }

    public void suggestSlots(String slotStr)  {
        String[] times = slotStr.split(":");
        TimeSlot requestedSlot = new TimeSlot(Integer.parseInt(times[0]), Integer.parseInt(times[1]));

        for(Building building: buildings.values()){
            for(Floor floor: building.getAllFloors()){
                for(ConferenceRoom room : floor.getAllRooms()){
                    List<TimeSlot> slot = room.suggestSlots(requestedSlot,3);
                    if(!slot.isEmpty()){
                        for (TimeSlot suggestion : slot) {
                            System.out.println(suggestion);
                        }
                    }
                }
            }
        }
    }


}
