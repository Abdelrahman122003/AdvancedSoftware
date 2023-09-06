package ObserverDesignPattern;

public interface MyObservable {
    void addObserver(MyObserver o);
    void deleteObserver(MyObserver o);
    void notifyObservers(float temperature , float humidity , float pressure);
    void setChanged();
}
