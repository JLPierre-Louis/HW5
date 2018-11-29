import java.util.GregorianCalendar;
import java.util.LinkedList;
public class DailyWeatherReport {

    GregorianCalendar date;
    LinkedList<Double> tempReading;
    LinkedList<Double> aRainfall;

    public DailyWeatherReport(GregorianCalendar date, LinkedList<Double> tempReading, LinkedList<Double> aRainfall){
        this.date = date;
        this.tempReading = tempReading;
        this.aRainfall = aRainfall;
    }


}
