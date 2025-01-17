package MachineCoding;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Floor {
    private int floorNumber;
    private Map<String, ConferenceRoom> conferenceRooms;

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
        this.conferenceRooms = new HashMap<>();
    }

    public void addConferenceRoom(ConferenceRoom room) {
        conferenceRooms.put(room.getRoomId(), room);
    }

    public ConferenceRoom getConferenceRoom(String roomId) {
        return conferenceRooms.get(roomId);
    }

    public Collection<ConferenceRoom> getAllRooms() {
        return conferenceRooms.values();
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}
