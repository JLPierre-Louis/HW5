/**
 * Class that handles a readings time
 * 
 *
 */
public class Time {

    private int hours;
    private int minutes;

    public Time(int hours, int minutes){
        this.hours = hours;
        this.minutes = minutes;
    }

    /** 
     * method that gets the hours
     * @return the hours
     */
    public int getHours(){
        return hours;
    }

    /**
     * method that gets the minutes
     * @return the minutes
     */
    public int getMinutes(){
        return minutes;
    }



}
