package designpattern.behavioral.observer.weatherstation;


import designpattern.behavioral.observer.observer.IObserver;
import designpattern.behavioral.observer.observerable.IObserverable;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObserverable {

    private List<IObserver> observers;

    private int humidity;

    private int temperature;

    private int pressure;

    /**
     * Use construct to initialise an observer list
     */
    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(IObserver iObserver) {
        this.observers.add(iObserver);
    }

    @Override
    public void removeObserver(IObserver iObserver) {
        this.observers.remove(iObserver);
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(observer -> {
            observer.update();
        });
    }

    /**
     * when data is changed, notify all observers
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    public int getHumidity() {
        return this.humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
}
