import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;

public class WeatherMonitor {
	
	// We won't actually require you to provide examples of daily weather reports for every single day in a month. 
		// Your calculations of averageTempForMonth and totalRainfallForMonth should produce the averages over all days 
		// in the month for which there are daily weather reports.

    /**
     *
     * @param Month
     * @param Year
     * @return Returns average temperatures over all days with a temperate in a month
     */
	double averageTempForMonth(int Month, int Year) {
		return 2;
		
	}

    /**
     *
     * @param Month
     * @param Year
     * @return Returns average rainfall over all days with a rainfall in a month
     */
	double totalRainfallForMonth(int Month, int Year) {

	    


        return 0;
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
	        readingsOnly.add(aReading.rainfall);
	        tempsOnly.add(aReading.temp);

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

