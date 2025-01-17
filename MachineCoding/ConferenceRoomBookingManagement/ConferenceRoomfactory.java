package MachineCoding.ConferenceRoomBookingManagement;
import MachineCoding.*;

public class ConferenceRoomfactory implements RoomFactory {

    @Override
    public ConferenceRoom createRoom(String roomId, RoomType roomType) {

        return new ConferenceRoom(roomId, roomType);
    }
    
}
