package ObserverDesignPattern;


public class StatisticsDisplay implements MyObserver, DisplayElement{
    
 private float maxTemp;
    private float minTemp;
    private float sumTemp;
    private int numReadings;
    private MyObservable observable;
    public StatisticsDisplay(MyObservable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Avg/Min/Max Temperature: " + (sumTemp / numReadings) + " / " + minTemp + " / " + maxTemp);
    }
    @Override
    public void update(float temperature , float humidity , float pressure) {
        sumTemp += temperature;
        numReadings++;
        if (temperature > maxTemp) {
            maxTemp = temperature;
        }
        if (temperature < minTemp) {
            minTemp = temperature;
        }
        display();
    }
}
