
public class Reading implements IWeather {

    private Time Time;
    private double temp;
    private double rainfall;

    public Reading(Time aTime, double temp, double rainfall ){
        this.Time = aTime;
        this.temp = temp;
        this.rainfall = rainfall;
    }

    public Time getTime(){
        return Time;
    }

    public double getTemp(){
        return temp;
    }

    public double getRainfall(){
        return rainfall;
    }

}
