import java.util.GregorianCalendar;
import java.util.LinkedList;
public class DailyWeatherReport {

    private GregorianCalendar date;
    private LinkedList<Double> tempReading;
    private LinkedList<Double> aRainfall;

    public DailyWeatherReport(GregorianCalendar date, LinkedList<Double> tempReading, LinkedList<Double> aRainfall){
        this.date = date;
        this.tempReading = tempReading;
        this.aRainfall = aRainfall;
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


}
