import java.time.LocalDateTime;

public class TimeTracker {
    private LocalDateTime startTimeDate;
    private LocalDateTime endTimeDate;

    // Default constructor.
    public TimeTracker()
    {
        
    }

    // Gets start time.
    public LocalDateTime getStartTime()
    {
        return startTimeDate;
    }

    // Gets end time.
    public LocalDateTime getEndTime()
    {
        return endTimeDate;
    }

    // Sets a start time.
    public void setStartTime(LocalDateTime starTimeDate)
    {
        this.startTimeDate = java.time.LocalDateTime.now(); 
    } 

    // Sets a end time.
    public void setEndTime(LocalDateTime endTimeDate)
    {
        this.endTimeDate = java.time.LocalDateTime.now();
    }

}


