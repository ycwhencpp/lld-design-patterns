package MachineCoding.ConferenceRoomBookingManagement;

public enum RoomType {
    SMALL(5), MEDIUM(10), LARGE(20);

    private final int  capacity;

    RoomType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }

}