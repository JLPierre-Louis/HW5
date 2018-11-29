import java.util.GregorianCalendar;
import java.util.LinkedList;

public class WeatherMonitor {
	
	// We won't actually require you to provide examples of daily weather reports for every single day in a month. 
		// Your calculations of averageTempForMonth and totalRainfallForMonth should produce the averages over all days 
		// in the month for which there are daily weather reports.
	
	// method that produces the average temperature over all days in a month
	double averageTempForMonth(int Month, int Year) {
		
	}
	
	// method that produces the total rainfall over all days in a month
	double totalRainfallForMonth(int Month, int Year) {
		
	}
	
	DailyWeatherReport addDailyReport(GregorianCalendar date, LinkedList<Reading> readings) {
		
	}

}


// weather data initially gathered from a weather sensor
// sensor produces "Readings" which contain the Time(int hours, int minutes),
// Temperature(double in-degrees-Fahrenheit), and Rainfall(double amount).
// WeatherMonitor will store daily weather reports that each have all the 
// readings for that day. a "DailyWeatherReport" contains the
// Date(java class GregorianCalendar), and two LinkedLists(one for temp,
// and one for the rainfall, both for that day). 

