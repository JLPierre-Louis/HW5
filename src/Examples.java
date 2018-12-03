import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Examples {

    GregorianCalendar date1 = new GregorianCalendar(1990,11,15);

    Time time1 = new Time(12, 30);

    LinkedList<Reading> readings1 = new LinkedList<Reading>();

    Reading read1 = new Reading(time1, 70.4, 12.0);
    
    LinkedList<DailyWeatherReport> reports1 = new LinkedList<DailyWeatherReport>();
    LinkedList<Double> tempReadings1 = new LinkedList<Double>();
    LinkedList<Double> rainReadings1 = new LinkedList<Double>();
    LinkedList<DailyWeatherReport> reports2 = new LinkedList<DailyWeatherReport>();
    
    @Before
    public void setUp(){
        readings1.add(read1);
        tempReadings1.add(70.0);
        tempReadings1.add(71.0);
        tempReadings1.add(72.0);
        tempReadings1.add(74.0);
        rainReadings1.add(0.1);
        rainReadings1.add(0.3);
        rainReadings1.add(1.1);
        rainReadings1.add(0.7);
        reports1.add(new DailyWeatherReport(date1, tempReadings1, rainReadings1));
    }

/*
    @Test
    public void Test1(){
        LinkedList<Double> readingstest = new LinkedList<Double>();
        readingstest.add(70.4);

        LinkedList<Double> temptest = new LinkedList<Double>();
        temptest.add(12.0);

        DailyWeatherReport test1 = new DailyWeatherReport(date, readingstest, temptest);

    } */
    
    // test average temperature for month with data
    @Test
    public void averageTempTest1() {
    	WeatherMonitor monitor1 = new WeatherMonitor(reports1);
    	assertEquals(monitor1.averageTempForMonth(11, 1990), 71.75, 0.0);
    }
    
    // test average temperature for month with no data
    @Test
    public void averageTempTest2() {
    	WeatherMonitor monitor2 = new WeatherMonitor(reports2);
    	assertEquals(monitor2.averageTempForMonth(11, 1990), -1, 0.0);
    }
    
 // test total rain for month with data
    @Test
    public void totalRainTest1() {
    	WeatherMonitor monitor1 = new WeatherMonitor(reports1);
    	assertEquals(monitor1.totalRainfallForMonth(11, 1990), 2.2, 0.0);
    }
    
    // test total rain for month with no data
    @Test
    public void totalRainTest2() {
    	WeatherMonitor monitor2 = new WeatherMonitor(reports2);
    	assertEquals(monitor2.totalRainfallForMonth(11, 1990), 0, 0.0);
    }
}
