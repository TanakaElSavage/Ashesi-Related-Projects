import java.time.LocalTime;
import java.time.LocalDate;
import java.time.Duration;
public class UboraEvent {
    //Data Fields
    private String eventName;
    private String location;
    private LocalDate eventDate;
    private LocalTime startTime;
    private Duration duration;

    //No Args Constructor
    public UboraEvent() {
        this.eventName = "TBD";
        this.location = "TBD";
        this.eventDate = null;
        this.startTime = null;
        this.duration = null;
    }
    //Main Constructor with all args
    public UboraEvent ( String eventName, String location,LocalDate eventDate,
                      LocalTime startTime, Duration duration ) {
        this.eventName = eventName;
        this.location = location;
        this.eventDate = eventDate;
        this.startTime = startTime;
        this.duration = duration;
    }
    //Accessors
    public String getEventName() {
        return eventName;
    }
    public String getLocation() {
        return location;
    }
    public LocalDate getEventDate() {
        return eventDate;
    }
    public LocalTime getStartTime() {
        return startTime;
    }
    public Duration getDuration() {
        return duration;
    }
    //Mutators

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }
    //Override to String methods and Dis[play the Ubora event details
    @Override
    public String toString (){
        return "===Ubora Event Details===" +
                "\nName : " + getEventName() +
                "\nLocation : " + location +
                "\nDate : " + eventDate +
                "\nStart Time : " + startTime +
                "\nDuration : " + duration;
    }
}