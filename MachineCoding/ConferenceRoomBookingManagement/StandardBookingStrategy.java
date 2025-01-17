package MachineCoding.ConferenceRoomBookingManagement;

public class StandardBookingStrategy implements BookingStartegy {

    @Override
    public boolean isValidBooking(TimeSlot slot) {

        return slot.getDuration() <= 12 &&  slot.getStartHour() >= 8 && slot.getEndHour() <=20;
    }
    
}
