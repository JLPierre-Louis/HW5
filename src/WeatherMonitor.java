
/**
 * Class that is utilized for finding average temperatures and total rainfall
 * to monitor the weather
 * @author Jean-Luc Pierre-Louis and Roman Wicky van Doyer
 *
 */
public class WeatherMonitor implements IReport{
	
	IReport reports;
	
	WeatherMonitor(IReport reports) {
		this.reports = reports;
	}
	
	/**
     * method to calculate the average temperature for a month
     * @param Month : integer which represents the desired month
     * @param Year : integer that represents the desired year
     * @return Returns average temperatures over all days with a temperate in a month
     */
	public double averageTempForMonth(int Month, int Year) {
		return this.reports.averageTempForMonth(Month, Year);
	}
	
	/**
     * method to calculate the total rainfall for a month
     * @param Month : integer which represents the desired month
     * @param Year : integer that represents the desired year
     * @return Returns average rainfall over all days with a rainfall in a month
     */
	public double totalRainfallForMonth(int Month, int Year) {
		return this.reports.totalRainfallForMonth(Month, Year);
	}

}

