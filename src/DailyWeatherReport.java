import java.util.GregorianCalendar;
import java.util.LinkedList;

public class DailyWeatherReport{

    private GregorianCalendar date;
    private LinkedList<Double> tempReading;
    private LinkedList<Double> aRainfall;

    public DailyWeatherReport(GregorianCalendar date, LinkedList<Double> tempReading, LinkedList<Double> aRainfall){
        this.date = date;
        this.tempReading = tempReading;
        this.aRainfall = aRainfall;
    }
    
    public GregorianCalendar getDate() {
    	return date;
    }

    public void setDate(GregorianCalendar newDate){
        date = newDate;

    }

    public void setTempReading(LinkedList<Double> newtempReading){
        tempReading = newtempReading;
    }

    public void setaRainfall(LinkedList<Double> newaRainfall){
        aRainfall = newaRainfall;
    }
    
    public double averageTemp() {
    	double sumOfTemps = 0;
    	double counter = 0;
    	for(Double aReading: this.tempReading) {
			sumOfTemps = sumOfTemps + aReading;
			counter++;
		}
    	if(counter < 1) {
    		return -1; // -1 indicates no temperature readings
    	} else {
    		return sumOfTemps / counter;
    	}
    }
    
    public double totalRain() {
    	double sumOfRain = 0;
    	for(Double aReading: this.aRainfall) {
			sumOfRain = sumOfRain + aReading;
		}
    	return sumOfRain;
    }


}
