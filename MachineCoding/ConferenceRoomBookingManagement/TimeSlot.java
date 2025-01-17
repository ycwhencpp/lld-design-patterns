package MachineCoding.ConferenceRoomBookingManagement;
public class TimeSlot {
    private int startHour;
    private int endHour;

    public TimeSlot(int startHour, int endHour)  {
        if (startHour < 0 || startHour >= 24 || endHour < 0 || endHour > 24 || startHour >= endHour) {
            System.out.println("invalid time");
            return;
        }
        if (endHour - startHour > 12) {
            System.out.println("invalid booking limit");
            return;        }
        this.startHour = startHour;
        this.endHour = endHour;
    }

    public boolean overlaps(TimeSlot other) {
        return !(this.endHour <= other.startHour || this.startHour >= other.endHour);
    }

    public int getStartHour() {
        return startHour;
    }

    public int getEndHour() {
        return endHour;
    }

    public int getDuration() {
        return endHour - startHour;
    }

    public String getTime(){
        return this.startHour + " to " + this.endHour;
    }

}
