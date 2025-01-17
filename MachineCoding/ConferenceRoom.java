package MachineCoding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import MachineCoding.*;

public class ConferenceRoom {
    String id;

    RoomType roomType;

    Set<TimeSlot> bookedSlots;

    public ConferenceRoom(String id, RoomType roomType) {
        this.id = id;
        this.roomType = roomType;
        this.bookedSlots = new HashSet<>();
    }

    public String getRoomId() {
        return id;
    }

    public RoomType getType() {
        return roomType;
    }

    public boolean isAvailable(TimeSlot slot) {
        for (TimeSlot bookedSlot : bookedSlots) {
            if (bookedSlot.overlaps(slot)) {
                return false;
            }
        }
        return true;
    }

    public void bookSlot(TimeSlot slot) {
        if (!isAvailable(slot)) {
            System.out.println("Slot already booked");
            return;
        }
        bookedSlots.add(slot);
    }

    public void cancelBooking(TimeSlot slot) {
        bookedSlots.remove(slot);
    }

    public Set<TimeSlot> getBookedSlots() {
        return new HashSet<>(bookedSlots);
    }

    public List<TimeSlot> suggestSlots(TimeSlot requestedSlot, int limit) {
        List<TimeSlot> suggestions = new ArrayList<>();
        int duration = requestedSlot.getDuration();
        int currentHour = requestedSlot.getEndHour();
        
        while (suggestions.size() < limit && currentHour < 24) {
            TimeSlot suggestion = new TimeSlot(currentHour, currentHour + duration);
            if (isAvailable(suggestion)) {
                suggestions.add(suggestion);
            }
            currentHour++;
        }
        return suggestions;
    }


}
