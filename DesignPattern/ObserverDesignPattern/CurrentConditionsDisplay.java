package ObserverDesignPattern;

public class CurrentConditionsDisplay  implements MyObserver, DisplayElement{
    
     MyObservable observable;
    private float temperature;
    private float humidity;
    public CurrentConditionsDisplay(MyObservable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
        // instanceof -> It is a tool that helps us ensure that the observable type is WeatherData.
    @Override
    public void update(float temperature, float humidity, float pressure) {
          if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
    
    @Override
    public void display() {
        System.out.println("Current Conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
