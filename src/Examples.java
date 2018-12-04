import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Examples {

    GregorianCalendar date1 = new GregorianCalendar(1990,11,15);
    GregorianCalendar date2 = new GregorianCalendar(1990,10,14);
    GregorianCalendar date3 = new GregorianCalendar(1991,9,12);
    GregorianCalendar date4 = new GregorianCalendar(1992,8,11);
    GregorianCalendar date5 = new GregorianCalendar(1990,11,17);

    Time time1 = new Time(12, 30);

    LinkedList<Reading> readings1 = new LinkedList<Reading>();

    Reading read1 = new Reading(time1, 70.4, 12.0);
    
    LinkedList<DailyWeatherReport> reports1 = new LinkedList<DailyWeatherReport>();
    LinkedList<Double> tempReadings1 = new LinkedList<Double>();
    LinkedList<Double> rainReadings1 = new LinkedList<Double>();
    LinkedList<DailyWeatherReport> reports2 = new LinkedList<DailyWeatherReport>();
    LinkedList<DailyWeatherReport> reports3 = new LinkedList<DailyWeatherReport>();
    LinkedList<Double> tempReadings2 = new LinkedList<Double>();
    LinkedList<Double> rainReadings2 = new LinkedList<Double>();
    LinkedList<Double> tempReadings3 = new LinkedList<Double>();
    LinkedList<Double> rainReadings3 = new LinkedList<Double>();
    LinkedList<Double> tempReadings4 = new LinkedList<Double>();
    LinkedList<Double> rainReadings4 = new LinkedList<Double>();
    LinkedList<Double> tempReadings5 = new LinkedList<Double>();
    LinkedList<Double> rainReadings5 = new LinkedList<Double>();
    
    @Before
    public void setUp(){
        readings1.add(read1);
        tempReadings1.add(70.0);
        tempReadings1.add(71.0);
        tempReadings1.add(72.0);
        tempReadings1.add(74.0);
        tempReadings1.add(51.0);
        rainReadings1.add(0.1);
        rainReadings1.add(0.3);
        rainReadings1.add(1.1);
        rainReadings1.add(0.7);
        reports1.add(new DailyWeatherReport(date1, tempReadings1, rainReadings1));
        tempReadings2.add(50.0);
        tempReadings2.add(55.0);
        tempReadings2.add(60.0);
        rainReadings2.add(1.5);
        rainReadings2.add(2.5);
        rainReadings2.add(3.0);
        tempReadings3.add(60.0);
        tempReadings3.add(62.0);
        tempReadings3.add(69.9);
        rainReadings3.add(4.0);
        rainReadings3.add(5.0);
        rainReadings3.add(1.7);
        tempReadings4.add(70.0);
        tempReadings4.add(71.1);
        tempReadings4.add(68.6);
        rainReadings4.add(7.1);
        rainReadings4.add(1.3);
        rainReadings4.add(10.1);
        tempReadings5.add(72.0);
        tempReadings5.add(74.0);
        tempReadings5.add(65.0);
        tempReadings5.add(51.0);
        rainReadings5.add(6.1);
        rainReadings5.add(3.3);
        rainReadings5.add(11.1);
        reports3.add(new DailyWeatherReport(date1, tempReadings1, rainReadings1));
        reports3.add(new DailyWeatherReport(date2, tempReadings2, rainReadings2));
        reports3.add(new DailyWeatherReport(date3, tempReadings3, rainReadings3));
        reports3.add(new DailyWeatherReport(date4, tempReadings4, rainReadings4));
        reports3.add(new DailyWeatherReport(date5, tempReadings5, rainReadings5));
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
    	IReport report1 = new ReportList(reports1);
    	WeatherMonitor monitor1 = new WeatherMonitor(report1);
    	assertEquals(monitor1.averageTempForMonth(11, 1990), 67.6, 0.0);
    }
    
    // test average temperature for month with no data
    @Test
    public void averageTempTest2() {
    	IReport report2 = new ReportList(reports2);
    	WeatherMonitor monitor2 = new WeatherMonitor(report2);
    	assertEquals(monitor2.averageTempForMonth(11, 1990), -1, 0.0);
    }
    
    // test average temperature with a lot of data
    @Test
    public void averageTemptTest3() {
    	IReport report3 = new ReportList(reports3);
    	WeatherMonitor monitor3 = new WeatherMonitor(report3);
    	assertEquals(monitor3.averageTempForMonth(11, 1990), 66.55, 0.0);
    }
    
 // test total rain for month with data
    @Test
    public void totalRainTest1() {
    	IReport report1 = new ReportList(reports1);
    	WeatherMonitor monitor1 = new WeatherMonitor(report1);
    	assertEquals(monitor1.totalRainfallForMonth(11, 1990), 2.2, 0.0);
    }
    
    // test total rain for month with no data
    @Test
    public void totalRainTest2() {
    	IReport report2 = new ReportList(reports2);
    	WeatherMonitor monitor2 = new WeatherMonitor(report2);
    	assertEquals(monitor2.totalRainfallForMonth(11, 1990), 0, 0.0);
    }
}
