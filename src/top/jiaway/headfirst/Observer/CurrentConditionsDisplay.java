package top.jiaway.headfirst.Observer;

public class CurrentConditionsDisplay implements Observer,DisplayElement {

    private final Subject weatherData;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Subject weatherData) {

        this.weatherData = weatherData;
        weatherData.registerObserver(this);

    }

    @Override
    public void display() {
        System.out.println("显示当前观测的值");

    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
