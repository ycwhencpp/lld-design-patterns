package MachineCoding.ConferenceRoomBookingManagement;

public class FlexibleBookingStrategy  implements BookingStartegy    {

    @Override
    public boolean isValidBooking(TimeSlot slot) {
        return slot.getDuration() <= 12;
    }
    
}
