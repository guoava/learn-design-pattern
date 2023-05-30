package designpattern.behavioral.observer.test.buildin;

import java.util.Observable;

public class BuildInWeatherStation extends Observable {

    /**
     * 1. no longer needs to create a data structure to hold Observer
     */
    public BuildInWeatherStation(){

    }

    /**
     * when data is changed, notify all observers
     */
    public void measurementsChanged() {
         setChanged();
         notifyObservers();
    }

    private int humidity;

    private int temperature;

    private int pressure;

    public int getHumidity() {
        return humidity;
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
