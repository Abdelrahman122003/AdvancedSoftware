package ObserverDesignPattern;

public class ForecastDisplay implements MyObserver, DisplayElement {
    
   private MyObservable observable;
    private float currentPressure = 29.92f;
    private float lastPressure;
    public ForecastDisplay(MyObservable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    // instanceof -> It is a tool that helps us ensure that the observable type is WeatherData.
    @Override
    public void update(float temperature , float humidity , float pressure) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            lastPressure =  currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
    @Override
    public void display() {
        System.out.println("Forecast display");
    }
}
