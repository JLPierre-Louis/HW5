/**
 * Class that contains the weather readings
 * @author Jean-Luc Pierre-Louis and Roman Wicky van Doyer
 *
 */
public class Reading{

    private Time Time;
    private double temp;
    private double rainfall;

    public Reading(Time aTime, double temp, double rainfall ){
        this.Time = aTime;
        this.temp = temp;
        this.rainfall = rainfall;
    }

    /**
     * method that gets the time of the reading
     * @return Time : the time of the reading
     */
    public Time getTime(){
        return Time;
    }

    /**
     * method that gets the temperature of the reading
     * @return double : the temperature
     */
    public double getTemp(){
        return temp;
    }

    /**
     * method that returns the rainfall of the reading
     * @return double : the rainfall
     */
    public double getRainfall(){
        return rainfall;
    }

}
