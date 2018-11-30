import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Examples {

    GregorianCalendar date = new GregorianCalendar(11,15,1990);

    Time time1 = new Time(12, 30);

    LinkedList<Reading> readings1 = new LinkedList<Reading>();

    Reading read1 = new Reading(time1, 70.4, 12.0);

    @Before
    public void setUp(){
        readings1.add(read1);
    }



    @Test
    public void Test1(){
        LinkedList<Double> readingstest = new LinkedList<Double>();
        readingstest.add(70.4);

        LinkedList<Double> temptest = new LinkedList<Double>();
        temptest.add(12.0);

        DailyWeatherReport test1 = new DailyWeatherReport(date, readingstest, temptest);

    }
}
