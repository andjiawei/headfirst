package top.jiaway.headfirst.Observer;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i<observers.size();i++){
            Observer observer = observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        measurementsChanged();

    }

    public void measurementsChanged() {
        notifyObservers();
    }
}
