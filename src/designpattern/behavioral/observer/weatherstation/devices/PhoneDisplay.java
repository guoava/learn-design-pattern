package designpattern.behavioral.observer.weatherstation.devices;


import designpattern.behavioral.observer.observer.IObserver;
import designpattern.behavioral.observer.observerable.IObserverable;
import designpattern.behavioral.observer.weatherstation.WeatherStation;

public class PhoneDisplay implements IDisplayBehavior, IObserver {

    private IObserverable iObserverable;

    public PhoneDisplay(IObserverable iObserverable) {
        this.iObserverable = iObserverable;
        // register to become an observer
        this.iObserverable.registerObserver(this);
    }

    @Override
    public void display() {
        WeatherStation weatherStation = (WeatherStation) this.iObserverable;
        int temperature = weatherStation.getTemperature();
        int humidity = weatherStation.getHumidity();
        int pressure = weatherStation.getPressure();
        System.out.printf("--- PhoneDisplay ---\ntemperature:%d\nhumidity:%d\npressure:%d\n--- PhoneDisplay ---\n",temperature,humidity,pressure);
    }

    @Override
    public void update() {
        display();
    }
}
