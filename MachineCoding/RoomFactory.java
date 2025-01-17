package MachineCoding;

public interface RoomFactory {
    public ConferenceRoom createRoom(String roomId, RoomType roomType);
}
