import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class ReportList implements IReport {

	// We won't actually require you to provide examples of daily weather reports for every single day in a month. 
			// Your calculations of averageTempForMonth and totalRainfallForMonth should produce the averages over all days 
			// in the month for which there are daily weather reports.

		private LinkedList<DailyWeatherReport> reports = new LinkedList<DailyWeatherReport>();
		
		ReportList(LinkedList<DailyWeatherReport> reports) {
			this.reports = reports;
		}
		
	    /**
	     *
	     * @param Month
	     * @param Year
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
	     *
	     * @param Month
	     * @param Year
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
	     *
	     * @param date
	     * @param readings
	     * @return adds a weather report with the specific date, and readings for that day
	     */
		public DailyWeatherReport addDailyReport(GregorianCalendar date, LinkedList<Reading> readings) {

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
