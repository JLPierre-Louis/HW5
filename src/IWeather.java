import java.util.GregorianCalendar;
import java.util.LinkedList;

public interface IWeather {

	DailyWeatherReport addDailyReport(GregorianCalendar date, LinkedList<Reading> readings);

}
