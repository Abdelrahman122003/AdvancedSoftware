package ObserverDesignPattern;

import java.util.ArrayList;

public class WeatherData implements MyObservable {
     private ArrayList<MyObserver> observers;
    private boolean changed = false;
    private float temperature;
    private float humidity;
    private float pressure;
    public WeatherData() {
        observers = new ArrayList<>();
    }
    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }
    public void setMeasurements(float temperature , float humidity , float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    @Override
    public void addObserver(MyObserver o) {
        observers.add(o);
    }
    @Override
    public void deleteObserver(MyObserver o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(o);
        }
    }
    @Override
    // **why we are use changed?
    // Notifying observers doesn't always occur so we are use var --> changed
    // If changes occur always, in this moment, the observable will notify observers always. 
    // This is not allowed to happen, so we put a condition to notify observers.
    public void notifyObservers(float temperature , float humidity , float pressure) {
        if (changed) {
            for (int i = 0 ; i < observers.size() ; i++) {
                MyObserver obs = observers.get(i);
                obs.update(temperature , humidity , pressure);
            }
        }
        changed = false;
    }
    public void notifyObservers() {
        notifyObservers(getTemperature() , getHumidity() , getPressure());
    }
    @Override
    public void setChanged() {
        changed = true;
    }
    public float getHumidity() {
        return humidity;
    }
    public float getPressure() {
        return pressure;
    }
    public float getTemperature() {
        return temperature;
    }
}
