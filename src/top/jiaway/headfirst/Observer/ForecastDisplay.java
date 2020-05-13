package top.jiaway.headfirst.Observer;

public class ForecastDisplay implements Observer,DisplayElement {

    private final Subject weatherData;
    private float temperature;
    private float humidity;

    public ForecastDisplay(Subject weatherData) {

        this.weatherData = weatherData;
        weatherData.registerObserver(this);

    }

    @Override
    public void display() {
        System.out.println("根据气压计显示天气预报");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
