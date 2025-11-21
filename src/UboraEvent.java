
public class UboraEvent {
    //Data Fields
    private String eventName;
    private String location;
    private String eventDate;
    private String startTime;
    private int durationMinutes;

    //Constructor
    public UboraEvent ( String eventName, String location,String eventDate,
                      String startTime, int durationMinutes ) {
        this.eventName = eventName;
        this.location = location;
        this.eventDate = eventDate;
        this.startTime = startTime;
        this.durationMinutes = durationMinutes;
    }
    //Accessors
    public String getEventName() {
        return eventName;
    }
    public String getLocation() {
        return location;
    }
    public String getEventDate() {
        return eventDate;
    }
    public String getStartTime() {
        return startTime;
    }
    public int getDurationMinutes() {
        return durationMinutes;
    }
    //Mutators

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }
    //Override to String methods and Dis[play the Ubora event details
    @Override
    public String toString (){
        return "===Ubora Event Details===" +
                "\nName : " + eventName +
                "\nLocation : " + location +
                "\nDate : " + eventDate +
                "\nStart Time : " + startTime +
                "\nDuration : " + durationMinutes;
    }
}