package top.jiaway.headfirst.Observer;

public class StatistcsDisplay implements Observer,DisplayElement {

    private final Subject weatherData;
    private float temperature;
    private float humidity;

    public StatistcsDisplay(Subject weatherData) {

        this.weatherData = weatherData;
        weatherData.registerObserver(this);

    }

    @Override
    public void display() {
        System.out.println("显示最小 平均 最大");

    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
