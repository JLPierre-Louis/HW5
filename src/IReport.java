/**
 * Interface to calculate averageTemp and totalRainfall
 * @author Jean-Luc Pierre-Louis and Roman Wicky van Doyer
 *
 */
public interface IReport {

	double averageTempForMonth(int Month, int Year);
	double totalRainfallForMonth(int Month, int Year);

	public void addDailyReport(DailyWeatherReport aReport);
	
}

