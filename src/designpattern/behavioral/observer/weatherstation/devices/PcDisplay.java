package designpattern.behavioral.observer.weatherstation.devices;


import designpattern.behavioral.observer.observer.IObserver;
import designpattern.behavioral.observer.observerable.IObserverable;
import designpattern.behavioral.observer.weatherstation.WeatherStation;

public class PcDisplay implements IDisplayBehavior, IObserver {

    private IObserverable iObserverable;

    public PcDisplay(IObserverable iObserverable) {
        this.iObserverable = iObserverable;
        // register to become an observer
        this.iObserverable.registerObserver(this);
    }

    @Override
    public void update() {
        display();
    }

    @Override
    public void display() {
        // cast to weatherStation to get data
        WeatherStation weatherStation = (WeatherStation) this.iObserverable;
        int temperature = weatherStation.getTemperature();
        int humidity = weatherStation.getHumidity();
        int pressure = weatherStation.getPressure();

        System.out.printf("--- PcDisplay ---\ntemperature:%d\nhumidity:%d\npressure:%d\n--- PcDisplay ---\n",temperature,humidity,pressure);
    }
}
