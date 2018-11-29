import java.util.GregorianCalendar;
import java.util.LinkedList;
public class DailyWeatherReport {

    GregorianCalendar date;
    LinkedList<Reading> aReading;
    LinkedList<Double> aRainfall;

    public DailyWeatherReport(GregorianCalendar date, LinkedList<Reading> aReading, LinkedList<Double> aRainfall){
        this.date = date;
        this.aReading = aReading;
        this.aRainfall = aRainfall;
    }


}
