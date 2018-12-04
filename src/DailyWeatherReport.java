import java.util.GregorianCalendar;
import java.util.LinkedList;

/**
 * Class that handles daily weather reports 
 * @author Jean-Luc Pierre-Louis and Roman Wicky van Doyer
 *
 */
public class DailyWeatherReport{

    private GregorianCalendar date;
    private LinkedList<Double> tempReading;
    private LinkedList<Double> aRainfall;

    public DailyWeatherReport(GregorianCalendar date, LinkedList<Double> tempReading, LinkedList<Double> aRainfall){
        this.date = date;
        this.tempReading = tempReading;
        this.aRainfall = aRainfall;
    }
    
    /**
     * method that gets the date
     * @return the date
     */
    public GregorianCalendar getDate() {
    	return date;
    }

    /**
     * method that sets the new date
     * @param newDate : new date to be set
     * @return void
     */
    public void setDate(GregorianCalendar newDate){
        date = newDate;

    }

    /**
     * method that sets the temp readings
     * @param newtempReading : linked list of doubles which represent the temp readins
     * @return void
     */
    public void setTempReading(LinkedList<Double> newtempReading){
        tempReading = newtempReading;
    }
    
    /**
     * method that sets the rainfall readings
     * @param newaRainfall : linked list of doubles which represent the rainfall readings
     * @return void
     */
    public void setaRainfall(LinkedList<Double> newaRainfall){
        aRainfall = newaRainfall;
    }
    
    /**
     * method that calculates the average temperature
     * @return the average temperature as a double
     */
    public double averageTemp() {
    	double sumOfTemps = 0;
    	double counter = 0;
    	for(Double aReading: this.tempReading) {
			sumOfTemps = sumOfTemps + aReading;
			counter++;
		}
    	if(counter < 1) {
    		return 0; // 0 indicates no temperature readings
    	} else {
    		return sumOfTemps / counter;
    	}
    }
    
    /**
     * method that calculates the total rainfall
     * @return the total rainfall as a double
     */
    public double totalRain() {
    	double sumOfRain = 0;
    	for(Double aReading: this.aRainfall) {
			sumOfRain = sumOfRain + aReading;
		}
    	return sumOfRain;
    }


}
