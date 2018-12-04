import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.stream.Collectors;

/**
 * Class that is used to deal with reports of weather data
 * @author Jean-Luc Pierre-Louis and Roman Wicky van Doyer
 *
 */
public class ReportList implements IReport {

		private LinkedList<DailyWeatherReport> reports = new LinkedList<DailyWeatherReport>();
		
		ReportList(LinkedList<DailyWeatherReport> reports) {
			this.reports = reports;
		}
		
	    /**
	     * method to calculate the average temperature for a month
	     * @param Month : integer which represents the desired month
	     * @param Year : integer that represents the desired year
	     * @return Returns average temperatures over all days with a temperate in a month
	     */
		public double averageTempForMonth(int Month, int Year) {
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
	     * method to calculate the total rainfall for a month
	     * @param Month : integer which represents the desired month
	     * @param Year : integer that represents the desired year
	     * @return Returns average rainfall over all days with a rainfall in a month
	     */
		public double totalRainfallForMonth(int Month, int Year) {
			LinkedList<DailyWeatherReport> data = this.reports.stream().filter(aReport -> (aReport.getDate().get(GregorianCalendar.MONTH) == Month && aReport.getDate().get(GregorianCalendar.YEAR) == Year)).collect(Collectors.toCollection(LinkedList::new));
			double sumOfRain = 0;
			for(DailyWeatherReport aReport: data) {
				sumOfRain = sumOfRain + aReport.totalRain();
			}
			return sumOfRain;
			
	    }

	    /**
	     * method to add a daily report
	     * @param date : Gregorian Calendar to indicate the date of the reading
	     * @param readings : linked list of readings 
	     * @return adds a weather report with the specific date, and readings for that day
	     */
		public DailyWeatherReport addDailyReport(GregorianCalendar date, LinkedList<Reading> readings) {

		    //Gets the month of that date
		    int month = date.get(Calendar.MONTH);
		    //Gets the day of the month of that date
		    int day = date.get(Calendar.DAY_OF_MONTH);
		    //Gets the year of the date
		    int year = date.get(Calendar.YEAR);
		    

		    date = new GregorianCalendar(year, month, day);

		    LinkedList<Double> readingsOnly = new LinkedList<Double>();
		    LinkedList<Double> tempsOnly = new LinkedList<Double>();

		    for(Reading aReading: readings){
		        readingsOnly.add(aReading.getRainfall());
		        tempsOnly.add(aReading.getTemp());
	        }

	        return new DailyWeatherReport(date, tempsOnly, readingsOnly);
	    }
	
}
