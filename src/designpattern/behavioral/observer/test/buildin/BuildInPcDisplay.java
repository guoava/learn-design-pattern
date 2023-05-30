package designpattern.behavioral.observer.test.buildin;


import designpattern.behavioral.observer.weatherstation.devices.IDisplayBehavior;

import java.util.Observable;
import java.util.Observer;

public class BuildInPcDisplay implements Observer, IDisplayBehavior {

    private Observable observable;

    public BuildInPcDisplay(Observable observable) {
        observable.addObserver(this);
        this.observable = observable;
    }

    /**
     * use
     *
     * @param obs the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     *            method.
     */
    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof BuildInWeatherStation) {
            BuildInWeatherStation weatherStation = (BuildInWeatherStation) obs;
            int humidity = weatherStation.getHumidity();
            int pressure = weatherStation.getPressure();
            int temperature = weatherStation.getTemperature();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Use buildIn Observer to display ");
        if (observable instanceof BuildInWeatherStation) {
            BuildInWeatherStation weatherStation = (BuildInWeatherStation) observable;
            int humidity = weatherStation.getHumidity();
            int pressure = weatherStation.getPressure();
            int temperature = weatherStation.getTemperature();
            System.out.printf("--- BuildInPcDisplay ---\ntemperature:%d\nhumidity:%d\npressure:%d\n--- PhoneDisplay ---\n", temperature, humidity, pressure);
        }
    }
}
