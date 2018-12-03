import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class WeatherMonitor implements IWeather{
	
	// We won't actually require you to provide examples of daily weather reports for every single day in a month. 
		// Your calculations of averageTempForMonth and totalRainfallForMonth should produce the averages over all days 
		// in the month for which there are daily weather reports.

	private LinkedList<DailyWeatherReport> reports = new LinkedList<DailyWeatherReport>();
	
	WeatherMonitor(LinkedList<DailyWeatherReport> reports) {
		this.reports = reports;
	}
	
    /**
     *
     * @param Month
     * @param Year
     * @return Returns average temperatures over all days with a temperate in a month
     */
	double averageTempForMonth(int Month, int Year) {
		LinkedList<DailyWeatherReport> data = this.reports.stream().filter(aReport -> (aReport.getDate().get(GregorianCalendar.MONTH) == Month && aReport.getDate().get(GregorianCalendar.YEAR) == Year)).collect(Collectors.toCollection(LinkedList::new));
		double sumOfTemps = 0;
		double counter = 0;
		for(DailyWeatherReport aReport: data) {
			sumOfTemps = sumOfTemps + aReport.averageTemp();
			counter++;
		}
		if(counter < 1) {
			return -1.0; // -1 indicates no weather data for given month and year 
		} else {
			return sumOfTemps / counter;
		}
	}
	
    /**
     *
     * @param Month
     * @param Year
     * @return Returns average rainfall over all days with a rainfall in a month
     */
	double totalRainfallForMonth(int Month, int Year) {
		LinkedList<DailyWeatherReport> data = this.reports.stream().filter(aReport -> (aReport.getDate().get(GregorianCalendar.MONTH) == Month && aReport.getDate().get(GregorianCalendar.YEAR) == Year)).collect(Collectors.toCollection(LinkedList::new));
		double sumOfRain = 0;
		for(DailyWeatherReport aReport: data) {
			sumOfRain = sumOfRain + aReport.totalRain();
		}
		return sumOfRain;
		
    }

    /**
     *
     * @param date
     * @param readings
     * @return adds a weather report with the specific date, and readings for that day
     */
	DailyWeatherReport addDailyReport(GregorianCalendar date, LinkedList<Reading> readings) {

	    //Gets the month of that date
	    int month = date.get(Calendar.MONTH);
	    //Gets the day of the month of that date
	    int day = date.get(Calendar.DAY_OF_MONTH);

	    int year = date.get(Calendar.YEAR);



	    date = new GregorianCalendar(month, day, year);

	    LinkedList<Double> readingsOnly = new LinkedList<Double>();
	    LinkedList<Double> tempsOnly = new LinkedList<Double>();

	    for(Reading aReading: readings){
	        readingsOnly.add(aReading.getRainfall());
	        tempsOnly.add(aReading.getTemp());

        }


        return new DailyWeatherReport(date, tempsOnly, readingsOnly);
    }

}


// weather data initially gathered from a weather sensor
// sensor produces "Readings" which contain the Time(int hours, int minutes),
// Temperature(double in-degrees-Fahrenheit), and Rainfall(double amount).
// WeatherMonitor will store daily weather reports that each have all the 
// readings for that day. a "DailyWeatherReport" contains the
// Date(java class GregorianCalendar), and two LinkedLists(one for temp,
// and one for the rainfall, both for that day).

//When constructing a date for a daily weather report, use this version of the GregorianCalendar constructor:
// public GregorianCalendar (int year, int month, int dayOfMonth)

