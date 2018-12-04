
public class WeatherMonitor implements IReport{
	
	IReport reports;
	
	WeatherMonitor(IReport reports) {
		this.reports = reports;
	}
	
	public double averageTempForMonth(int Month, int Year) {
		return this.reports.averageTempForMonth(Month, Year);
	}
	
	public double totalRainfallForMonth(int Month, int Year) {
		return this.reports.totalRainfallForMonth(Month, Year);
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

